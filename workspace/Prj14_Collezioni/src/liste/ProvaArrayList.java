package liste;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) {
		ArrayList<String> citta = new ArrayList<>();
		
		citta.add("torino");
		citta.add("milano");
		citta.add("roma");

		System.out.println("Dimensione collezione" + citta.size());
		
//		citta.remove(1);
		
		System.out.println("Dimensione collezione" + citta.size());
		
		for (String city : citta) {
			System.out.println(city);
		}
		
		System.out.println("La prima città è: " + citta.get(0));
	}

}
