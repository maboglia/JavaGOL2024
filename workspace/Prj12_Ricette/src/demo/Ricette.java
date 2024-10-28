package demo;

import java.io.File;
import java.util.ArrayList;

import model.Ricetta;
import util.LeggiScriviFile;

public class Ricette {

	public static void main(String[] args) {

		ArrayList<Ricetta> ricette = new ArrayList<>();
		File f = new File("files/ricette.csv");
		File f2 = new File("files/ricette.html");
		ArrayList<String> outputhtml = new ArrayList<>();
		ArrayList<String> righeFile = LeggiScriviFile.leggiRighe(f);
		for (String riga : righeFile) {
			String[] split = riga.split(",", 2);
			String nome = split[0].replaceAll("\"", "");
			String ingredienti = split[1].replaceAll("\"", "");
			ricette.add(new Ricetta(nome, ingredienti));
		}
		
		outputhtml.add(header());
		outputhtml.add(tabella(ricette));
		outputhtml.add(footer());
		
		LeggiScriviFile.scriviRighe(outputhtml, f2);
		System.out.println("done!");
	}

	private static String footer() {
		// TODO Auto-generated method stub
		return """
				</body>
				</html>
				""";
	}

	private static String tabella(ArrayList<Ricetta> ricette) {
		String output = "<table>";
		
		for (Ricetta ricetta : ricette) {
			output += "<tr>";
				output += "<td>";
				output += ricetta.getNome();
				output += "</td>";
				output += "<td>";
				output += ricetta.getIngredienti();
				output += "</td>";
			output += "</tr>";
		}
		output += "</table>";
		return output;
	}

	private static String header() {
		// TODO Auto-generated method stub
		return """
				<html>
				<head>
				<title>Ricette</title>
				<style>
				h1 {color: red;}
				table  {border: 1px solid gray;}
				td {padding:5px}
				</style>
				</head>
				<body>
				<h1>Ricette</h1>
				""";
	}

	
	
}
