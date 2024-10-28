package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.LeggiScriviFile;
import controller.RegistroController;
import veicoli.AutoElettrica;
import veicoli.Automobile;
import veicoli.Moto;
import veicoli.Veicolo;

public class AutoSaloneDemo {

	public static void main(String[] args) throws FileNotFoundException {

		
		

		RegistroController ctrl = new RegistroController();
		
		ArrayList<String> lettura = 
				LeggiScriviFile.leggiRighe(new File("files/auto.csv"));
		
		LeggiScriviFile.scriviRighe(lettura, new File("files/auto_copia.csv"));

		try {
			for(String riga : lettura) {
				String[] pezziDiRIga = riga.split(",");
				
				String marca = pezziDiRIga[0].replaceAll("\"", "");
				String modello = pezziDiRIga[1].replaceAll("\"", "");
				int cilindrata = Integer.parseInt( pezziDiRIga[2].replaceAll("\"", ""));
				
				String prezzoStringa = pezziDiRIga[3].replaceAll("\"", "");
				
				int prezzo = Integer.parseInt(prezzoStringa); 
				
				ctrl.addVeicolo(new Automobile(marca, modello, cilindrata, prezzo));
				
			}
		} 
		catch (NumberFormatException e) {
			System.err.println("Si è verificata un'eccezione di tipo number format!");
			System.err.println(e.getMessage());
		} 		
		catch (Exception e) {
			System.err.println("Si è verificata un'eccezione generica!");
			System.err.println(e.getMessage());
		}
		
		
		
//		Scanner input = new Scanner(new File("files/auto.csv")); 
//		
//		while (input.hasNextLine()) {
//			String rigaFile = input.nextLine();
//			String[] pezziDiRIga = rigaFile.split(",");
//			String marca = pezziDiRIga[0].replaceAll("\"", "");
//			System.out.println(marca);
//		}
		
//		ctrl.addVeicolo(new Moto("Yamaha", "MT09", 850, 6000));
//		ctrl.addVeicolo(new Automobile("Fiat", "Panda", 1200, 2000));
//		ctrl.addVeicolo(new Automobile("Fiat", "Punto", 1400, 2500));
//		ctrl.addVeicolo(new Automobile("Toyota", "Yaris", 1300, 2200));
//		ctrl.addVeicolo(new Automobile("BMW", "X5", 2500, 12000));
//		ctrl.addVeicolo(new AutoElettrica("toyota", "prius", 1800, 3000));
		
		ArrayList<Veicolo> all = ctrl.getAll();
		
		System.out.println("Nel registro ci sono");
		System.out.println(all.size() + " veicoli");
		
		double totale = 0;
		
		for (Veicolo v : all) {
			System.out.println(v);
			totale += v.getPrezzo();
		}
		
		System.out.println("Il totale in vendita è " + totale);

	}

}
