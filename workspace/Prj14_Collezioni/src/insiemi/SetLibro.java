package insiemi;

import java.util.ArrayList;
import java.util.HashSet;

import model.Libro;

public class SetLibro {

	public static void main(String[] args) {
		HashSet<Libro> libri = new HashSet<Libro>();
		
		libri.add(new Libro("io robot", "asimov", 123, 12));
		libri.add(new Libro("de bello garlic", "pippo", 78, 88));
		libri.add(new Libro("i promessi", "manzoni", 234, 5));
		libri.add(new Libro("i promessi", "manzoni", 234, 5));
		libri.add(new Libro("la divina", "dante", 55, 4));
		libri.add(new Libro("de bello garlic", "pippo", 78, 88));
		libri.add(new Libro("la divina", "dante", 55, 4));
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}

	}

}
