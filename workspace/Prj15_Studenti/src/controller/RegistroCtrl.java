package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Registro;
import model.Studente;
import view.StudentView;

public class RegistroCtrl {

	private Registro registro;
	
	public RegistroCtrl(String nomeCorso) {
		this.registro = new Registro(nomeCorso);
	}
	//dependency injection -> low coupling
	public RegistroCtrl(Registro r) {
		this.registro = r;
	} 
	
	public void addStudente(Studente s) {
		this.registro
			.getStudenti()
			.add(s);
	}
	
	public List<Studente> getStudenti(){
		return this.registro.getStudenti();
	}
	
	public List<Studente> faiAppello(){
		
		List<Studente> presenti = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (Studente studente : registro.getStudenti()) {
			System.out.println("E' presente lo studente");
			System.out.println(studente);
			String risposta = scanner.nextLine();
			if (risposta.startsWith("s")) {
				presenti.add(studente);
			} 
		}
		
		scanner.close();
		return presenti;
	}
	
	public int getNumeroStudenti() {
		return this.registro.getStudenti().size();
	}
	@Override
	public String toString() {
		return "RegistroCtrl [registro=" + registro + "]";
	}
	
	public String getStudenteHtmlById(int id) {
		Studente s = null;
		try {
			double divisione = 7 / 0;
			s = this.registro.getStudenti().get(id);
		} 
		catch (IndexOutOfBoundsException e) {
			System.err.println("C'è un problema ben preciso");
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.err.println("C'è un generico problema");
			System.err.println(e.getMessage());
		}
					
		if (s != null) {
			StudentView vista = new StudentView(s);
			return vista.getCard();
		} else {
			return "<div>Studente non trovato</div>";
		}
		
	}
}
