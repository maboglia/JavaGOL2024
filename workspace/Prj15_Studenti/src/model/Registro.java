package model;

import java.util.ArrayList;
import java.util.List;

public class Registro {

	private String corso;
	//private Studente[] studenti;
	private List<Studente> studenti = new ArrayList<>();
	
	public Registro(String corso) {
		this.corso = corso;
	}

	public String getCorso() {
		return corso;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}
	
	
	
}
