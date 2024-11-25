package demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class GenericRandom {
	
	HashMapDati dati = new HashMapDati();
	HashMap<Integer, String[]> mappa = dati.mappaDati(); 	
	int numero = Collections.max(mappa.keySet());

	public int genera() {
		double casuale = Math.random();
		return (int) (casuale * numero) +1;
	}
		
	
	int numero3 = 6;

	public int genera3() {
		double casuale = Math.random();
		return (int) (casuale * numero3) +1;
	}

}
