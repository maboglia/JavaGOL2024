package controller;

import java.util.ArrayList;

import model.Libro;

public class LibroController {

	private static ArrayList<Libro> libri = new ArrayList<>();
	
	public static void init() {
		libri.add(new Libro("io robot", "asimov", 123, 12));
		libri.add(new Libro("i promessi", "manzoni", 234, 5));
		libri.add(new Libro("la divina", "dante", 55, 4));
		libri.add(new Libro("de bello garlic", "pippo", 78, 88));
	}
	
	public static void addLibro(Libro l) {
		libri.add(l);
	}
	
	public static ArrayList<Libro> getLibri() {
		return libri;
	}
	
}
