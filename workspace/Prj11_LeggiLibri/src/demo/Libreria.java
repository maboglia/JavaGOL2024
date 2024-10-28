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

		ArrayList<String> outputHtml = new ArrayList<>();
		
		outputHtml.add("<html>");
		outputHtml.add("<head>");
		outputHtml.add("</head>");
		outputHtml.add("<body>");
		outputHtml.add("<h1>");
		outputHtml.add("Elenco libri");
		outputHtml.add("</h1>");
		
		outputHtml.add("<table>");
		
		for (String riga : leggiRighe) {
			String[] split = riga.split(",");
			String titolo = split[0].replaceAll("\"", "");
			String autore = split[1].replaceAll("\"", "");
			String editore = split[3].replaceAll("\"", "");
			
			int pagine = Integer.parseInt(split[2].replaceAll("\"", ""));
			double prezzo = Double.parseDouble(split[4].replaceAll("\"", ""));
			
			Libro l = new Libro(titolo, autore, pagine, editore, prezzo);
			
			if (l.getEditore().equals("Mondadori")) {
			
			outputHtml.add("<tr>");

			outputHtml.add("<td>");
				outputHtml.add(l.getTitolo());
			outputHtml.add("</td>");

			outputHtml.add("<td>");
			outputHtml.add(l.getAutore());
			outputHtml.add("</td>");
			
			outputHtml.add("<td>");
			outputHtml.add(l.getEditore());
			outputHtml.add("</td>");
			
			outputHtml.add("<td>");
			outputHtml.add(""+l.getPagine());
			outputHtml.add("</td>");
			
			outputHtml.add("<td>");
			outputHtml.add(""+l.getPrezzo());
			outputHtml.add("</td>");
			
			outputHtml.add("</tr>");
			}
		}
		
		outputHtml.add("</table>");
		outputHtml.add("</body>");
		outputHtml.add("</html>");
		
		LeggiScriviFile.scriviRighe(outputHtml, new File("files/libri.html"));
		System.out.println("Lavoro terminato");
	}

}
