package insiemi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaTreeSet {

	public static void main(String[] args) {
		Set<String> citta = new TreeSet<String>();

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
