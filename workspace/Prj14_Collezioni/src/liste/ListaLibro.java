package liste;

import java.util.ArrayList;

import model.Libro;

public class ListaLibro {

	public static void main(String[] args) {
		ArrayList<Libro> libri = new ArrayList<Libro>();
		
		libri.add(new Libro("io robot", "asimov", 123, 12));
		libri.add(new Libro("i promessi", "manzoni", 234, 5));
		libri.add(new Libro("la divina", "dante", 55, 4));
		libri.add(new Libro("de bello garlic", "pippo", 78, 88));
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}

	}

}
