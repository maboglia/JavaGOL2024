package insiemi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Libro;

public class ProvaTreeSet {

	public static void main(String[] args) {
//		Set<String> citta = new TreeSet<String>();
//
//		citta.add("torino");
//		citta.add("torino");
//		citta.add("torino");
//		citta.add("torino");
//		citta.add("torino");
//		citta.add("milano");
//		citta.add("milano");
//		citta.add("milano");
//		citta.add("milano");
//		citta.add("roma");
//		citta.add("roma");
//		citta.add("roma");
//		citta.add("roma");
//		
//		System.out.println("Dimensione collezione" + citta.size());

//		for (String city : citta) {
//			System.out.println(city);
//		}
	
		Set<Libro> libri = new TreeSet<>();

		libri.add(new Libro("Zeta la formica", "mauro", 10, 10));
		libri.add(new Libro("Alfa la formica", "gianluca", 5, 15));
		libri.add(new Libro("Beta la formica", "elena", 15, 5));
		libri.add(new Libro("Teta la formica", "annamaria", 20, 12));
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}

	}

}
