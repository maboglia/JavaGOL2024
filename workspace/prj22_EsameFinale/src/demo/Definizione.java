package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Dict;
import util.LeggiScriviFile;

public class Definizione {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMapDati dati = new HashMapDati();
		HashMap<Integer, String[]> mappa = dati.mappaDati(); 
		System.out.println(mappa);
//		for (Integer chiave : mappa.keySet()) {
//            System.out.println("Chiave: " + chiave + ", Valore: " + mappa.get(chiave));
//        }
				
		System.out.println("Vuoi vedere esempi per i vocaboli?");
		System.out.println("-> Scrivi si per continuare");
		System.out.println("-> Scrivi no per fermarti");
		String input = scanner.nextLine();
		while(input.equals("si")) {
			if(input.equals("si")) {
				GenericRandom numeroCasuale = new GenericRandom();
				int numero = numeroCasuale.genera();
				String[] x = mappa.get(numero);
				Dict d = new Dict(x[0], x[1], x[2], x[3]);
				System.out.println(d);
			}
			else {
				break;
			}
			System.out.println("Vuoi continuare a vedere esempi?");
			System.out.println("-> Scrivi si per continuare");
			System.out.println("-> Scrivi no per fermarti");
			input = scanner.nextLine();
		}
		
		ArrayList<String> output = new ArrayList<String>();
		output.add("Domande e rispettive risposte: ");
		
		System.out.println("Mettiti alla prova!");
		System.out.println("Hai 5 vite :) ");
		int sbagliate = 0;
		int giuste = 0;
		int index = 0;
		int vite = 5;
		while(sbagliate < 5) {
			Random3 risposta = new Random3();
			ArrayList<String> risp = risposta.casi();
			index ++;
			String result = risp.get(3);
			if (risp.get(3).equals("X")) {
				sbagliate++;
				System.out.println("Vite rimaste: "+ --vite + ":(" );
			} else {
				giuste++;
			}
			output.add("Domanda: " + index);
			output.addAll(risp);
//			System.out.println(risp);
		}
		LeggiScriviFile.scriviRighe(output, new File("files/risposte.txt"));
	}
}
