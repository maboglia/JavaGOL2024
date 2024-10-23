package demo;

import java.util.Scanner;

import libreria.Libro;

public class Biblioteca {

	public static Libro addLibro() {
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("Titolo del libro");
		String titoloLibro = mioscanner.nextLine();

		System.out.println("Autore del libro");
		String autoreLibro = mioscanner.nextLine();
		
		System.out.println("Numero di pagine");
		int numeroPagine = mioscanner.nextInt();
		
		Libro libroGenerico = new Libro(titoloLibro, autoreLibro, numeroPagine);
		return libroGenerico;
	}
	
	public static void main(String[] args) {

		Libro libro1 = addLibro();
		Libro libro2 = addLibro();
		Libro libro3 = addLibro();
		
		System.out.println("<ul>");
		System.out.println(libro1.schedaLibroHtml());
//		System.out.println("------------------------");
		System.out.println(libro2.schedaLibroHtml());
//		System.out.println("------------------------");
		System.out.println(libro3.schedaLibroHtml());
		System.out.println("</ul>");
		
		System.out.println(libro1);
		
	}
	
	
	
	

}
