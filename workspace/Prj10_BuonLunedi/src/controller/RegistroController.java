package controller;

import java.util.ArrayList;

import database.Registro;
import veicoli.Veicolo;

public class RegistroController {

	private Registro registro;
	
	public RegistroController() {
		this.registro = new Registro();
	}
	
	public void addVeicolo(Veicolo v) {
		this.registro.addVeicolo(v);
	}
	
	public ArrayList<Veicolo> getAll(){
		return this.registro.getVeicoli();
	}
	
	public ArrayList<String> getMarche(){
		ArrayList<String> marche = new ArrayList<>();
		
		marche.add("Fiat");
		marche.add("BMW");
		
		return marche;
	} 
	
}
