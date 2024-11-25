package giochi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class ComparatorePrezzo implements Comparator<Pubblicazione>{
//	@Override
//	public int compare(Pubblicazione o1, Pubblicazione o2) {
//		return 0;
//	}
//}

class ComparatoreTitolo implements Comparator<Pubblicazione>{
	@Override
	public int compare(Pubblicazione o1, Pubblicazione o2) {
		return 0;
	}
}
class ComparatoreTitoloDesc implements Comparator<Pubblicazione>{
	@Override
	public int compare(Pubblicazione o1, Pubblicazione o2) {
		return 0;
	}
}


public class Libreria {

	public static void main(String[] args) {
		
		Libro l1 = new Libro();
		Libro l2 = new Libro();
		Libro l3 = new Libro();
		Magazine m1 = new Magazine();
		
		m1.titolo = "mag 1";
		m1.prezzo = 1;
		
		
		l1.id = 1;
		l1.titolo = "test 1";
		l1.prezzo = 5;
	
		l2.id = 2;
		l2.titolo = "test 2";
		l2.prezzo = 4;
		
		l3.id = 3;
		l3.titolo = "test 3";
		l3.prezzo = 6;
		
		
//		List<Libro> libri = List.of(l1, l2, l3);
		List<Pubblicazione> libri = new ArrayList<Pubblicazione>();
		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(m1);
		
		List<String> parole = new ArrayList<String>(); 
		
		Comparator cp = new Comparator<Pubblicazione>() {

			@Override
			public int compare(Pubblicazione o1, Pubblicazione o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Comparator<Pubblicazione> ct = (o1, o2) -> 0;
		
		ComparatoreTitoloDesc ctd = new ComparatoreTitoloDesc();
		
		Collections.sort(libri, (o1, o2) -> 0);
		
		
		for (Pubblicazione pubblicazione : libri) {
			if (pubblicazione instanceof Libro)
			System.out.println(((Libro) pubblicazione).titolo);
		}
		
		
		
	}
	
	
}
