package liste;

import java.util.LinkedList;

public class ProvaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> citta = new LinkedList<>();
		
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
		
		citta.remove(1);
		
		System.out.println("Dimensione collezione" + citta.size());
		
		
		
		for (String city : citta) {
			System.out.println(city);
		}
		
		System.out.println("La prima città è: " + citta.get(0));
	}

}
