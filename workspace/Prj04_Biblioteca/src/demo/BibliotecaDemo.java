package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import libreria.Libro;
import libreria.Scaffale;

public class BibliotecaDemo {

	public static void main(String[] args) throws FileNotFoundException {
		Scaffale scaffale1 = new Scaffale();
		
		File mioFile = new File("files/Biblioteca.csv");
		
		Scanner mioScanner = new Scanner(mioFile);
		
		while(mioScanner.hasNextLine()) {
			String riga = mioScanner.nextLine();
			//System.out.println(riga);
			String[] split = riga.split(";");
			String autore = split[0];
			String titolo = split[1];
			scaffale1.addLibro(new Libro(titolo, autore, 10));
		}
		
		

		Libro[] libri = scaffale1.getLibri();
		
//		for (int i = 0; i < libri.length; i++) {
//			if (libri[i] != null)
//			System.out.println(libri[i].schedaLibro());
//		}
		
		System.out.println("<ul>");
		for (Libro libro : libri) {
			if (libro != null) {
				System.out.println(libro.schedaLibroHtml());
			}
		}
		System.out.println("</ul>");
		
	}

}
