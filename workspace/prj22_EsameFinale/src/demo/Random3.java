package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Dict;

public class Random3 {

	public ArrayList<String> casi() {
		
		Scanner scanner = new Scanner(System.in);
		HashMapDati dati = new HashMapDati();
		HashMap<Integer, String[]> mappa = dati.mappaDati(); 
		ArrayList<String> risultati = new ArrayList<String>();
		
		String giusto = "giusto";
		
		GenericRandom numeroCasuale = new GenericRandom();
		
		int numero1 = numeroCasuale.genera();
		int numero2 = numeroCasuale.genera();
		int numero3 = numeroCasuale.genera();
		
		String[] x1 = mappa.get(numero1);
		String[] x2 = mappa.get(numero2);
		String[] x3 = mappa.get(numero3);
		
		Dict d1 = new Dict(x1[0], x1[1], x1[2], x1[3]);
		Dict d2 = new Dict(x2[0], x2[1], x2[2], x2[3]);
		Dict d3 = new Dict(x3[0], x3[1], x3[2], x3[3]);
		
		String o1 = d1.getVocaboloIta();
		String o2 = d2.getVocaboloIta();
		String o3 = d3.getVocaboloIta();
		
		risultati.add(d1.getVocaboloEng());
		risultati.add(o1);
		
		System.out.println("Qual è la traduzione di " + d1.getVocaboloEng() + " ?");		
		
		int num = numeroCasuale.genera3();
		
		System.out.println(num);
		
		if (num == 1) {
			System.out.println("1)"+ o1);
			System.out.println("2)" + o2);
			System.out.println("3)" + o3);
		} else if (num == 2) {
			System.out.println("1)"+ o1);
			System.out.println("2)" + o3);
			System.out.println("3)" + o2);
		} else if (num == 3) {
			System.out.println("1)"+ o2);
			System.out.println("2)" + o1);
			System.out.println("3)" + o3);
		} else if (num == 4) {
			System.out.println("1)"+ o2);
			System.out.println("2)" + o3);
			System.out.println("3)" + o1);
		} else if (num == 5) {
			System.out.println("1)"+ o3);
			System.out.println("2)" + o1);
			System.out.println("3)" + o2);
		} else {
			System.out.println("1)"+ o3);
			System.out.println("2)" + o2);
			System.out.println("3)" + o1);
		}
		
		String input = scanner.nextLine();
		int in = Integer.parseInt(input);
		
		if (num == 1) {
			if (in == 1) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");
			} else if (in == 2){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");
			}else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");

			}
		} else if (num == 2) {
			if (in == 1) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");
			} else if (in == 2){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");
			}else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");
			}
		} 
		else if (num == 3) {
			if (in == 2) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");

			} else if (in == 1){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");

			} else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");
			}
		} else if (num == 5) {
			if (in == 2) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");

			} else if (in == 1){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");

			} else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");
			}
		} else if (num == 4) {
			if (in == 3) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");

			} else if (num == 1){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");
				
			} else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");
			}
		} else if (num == 6) {
			if (in == 3) {
				giusto = "giusto";
				System.out.println(giusto);
				risultati.add(o1);
				risultati.add("V");

			} else if (num == 1){
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o3);
				risultati.add("X");
				
			} else {
				giusto = "sbagliato";
				System.out.println(giusto);
				risultati.add(o2);
				risultati.add("X");
			}
		
		}
		return risultati;
	}
}
