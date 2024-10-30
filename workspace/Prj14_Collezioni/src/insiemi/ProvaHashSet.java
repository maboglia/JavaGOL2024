package insiemi;

import java.util.HashSet;

public class ProvaHashSet {

	public static void main(String[] args) {
		HashSet<String> citta = new HashSet<String>();

		citta.add("torino");
		citta.add("torino");
		citta.add("torino");
		citta.add("torino");
		citta.add("torino");
		citta.add("milano");
		citta.add("milano");
		citta.add("milano");
		citta.add("milano");
		citta.add("roma");
		citta.add("roma");
		citta.add("roma");
		citta.add("roma");
		
		System.out.println("Dimensione collezione" + citta.size());

		for (String city : citta) {
			System.out.println(city);
		}
		
	}

}
