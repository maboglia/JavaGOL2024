package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiScriviFile {
	
	//Static -> Metodo appartiene alla classe LeggiScriviFile
	public static ArrayList<String> leggiRighe(File nomeFile){
		
		ArrayList<String> righe = new ArrayList<>();
		
		try {
			Scanner input = new Scanner(nomeFile);
			 if (input.hasNextLine()) {
				 input.nextLine();
	          }
			
			while (input.hasNextLine()) {
				String riga = input.nextLine();
				righe.add(riga);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File non trovato");
		}
		
		return righe;
		
	}
	
	public static void scriviRighe(ArrayList<String> contenuto, File destinazione) {
		try {
			PrintWriter output = new PrintWriter(destinazione);
			
			for (String riga: contenuto) {
				output.println(riga);
			}
			output.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
