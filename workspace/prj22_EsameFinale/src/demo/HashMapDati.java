package demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import model.Dict;
import util.LeggiScriviFile;

public class HashMapDati {

	public HashMap<Integer, String[]> mappaDati() {
		ArrayList<String> leggiFile = LeggiScriviFile.leggiRighe(new File("files/dict.tsv"));
		HashMap<Integer, String[]> dizionario = new HashMap<>();
		
		for(String riga:leggiFile) {
			String[] pezziDiRiga = riga.split("\t");
			String ids = pezziDiRiga[0];
			String engl = pezziDiRiga[1];
			String ita = pezziDiRiga[2];
			String feng = pezziDiRiga[3];
			String fita = pezziDiRiga[4];
			int id = Integer.parseInt(ids);
			
			String[] val = {engl, ita, feng, fita};
			
			dizionario.put(id, val);
			
			Dict d = new Dict(id, engl, ita, feng, fita);
//			System.out.println(d);
		
		}		
		
		return dizionario;
	}	

}
