package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Libro;
import util.LeggiScriviFile;

public class Libreria {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> leggiRighe = 
				LeggiScriviFile.leggiRighe(new File("files/libri.csv"));

		PrintWriter output = new PrintWriter("files/libri.html");
		
		for (String riga : leggiRighe) {
			String[] split = riga.split(",");
			String titolo = split[0].replaceAll("\"", "");
			String autore = split[1].replaceAll("\"", "");
			String editore = split[3].replaceAll("\"", "");
			
			int pagine = Integer.parseInt(split[2].replaceAll("\"", ""));
			double prezzo = Double.parseDouble(split[4].replaceAll("\"", ""));
			
			Libro l = new Libro(titolo, autore, pagine, editore, prezzo);
			output.println(l);
		}
		output.close();
		
	}

}
