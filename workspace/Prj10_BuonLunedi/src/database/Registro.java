package database;

import java.util.ArrayList;

import veicoli.Veicolo;

public class Registro {

	private ArrayList<Veicolo> veicoli;
//	private Veicolo[] veicoli;
	
	public Registro() {
		this.veicoli = new ArrayList<>();
//		this.veicoli = new Veicolo[10];
	}
	
	public ArrayList<Veicolo> getVeicoli() {
		return veicoli;
	}
	
	public void addVeicolo(Veicolo v) {
		this.veicoli.add(v);
	}
}
