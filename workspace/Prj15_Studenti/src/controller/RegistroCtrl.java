package controller;

import java.util.List;

import model.Registro;
import model.Studente;

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
	
	public int getNumeroStudenti() {
		return this.registro.getStudenti().size();
	}
	@Override
	public String toString() {
		return "RegistroCtrl [registro=" + registro + "]";
	}
	
	
}
