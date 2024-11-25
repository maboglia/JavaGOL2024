package model;

import java.util.ArrayList;
import java.util.List;

public class Dizionario {


	private List<Definizione> definizioni = new ArrayList<>();
	
	
	public void add(Definizione def) {
		definizioni.add(def);
	}

	public List<Definizione> getDefinizioni() {
		return definizioni;
	}

	public void setDefinizioni(List<Definizione> definizioni) {
		this.definizioni = definizioni;
	}

	@Override
	public String toString() {
		return "Dizionario [definizioni=" + definizioni + "]";
	}


	
	
	
}