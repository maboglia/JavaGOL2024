package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Studente;

public class Segreteria {

	public static List<Studente> leggiFileRitornaStudenti(String nomeFile){
		
		List<Studente> studenti = new ArrayList<>();
		File f = new File(nomeFile); 
		try {
			Scanner scanner = new Scanner(f);
			
			while(scanner.hasNextLine()) {
				String riga = scanner.nextLine();
				String[] split = riga.split(";");
				String nome = split[0];
				String cognome = split[1];
				Studente s = new Studente(nome, cognome);
				studenti.add(s);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return studenti;
	}
	
}
