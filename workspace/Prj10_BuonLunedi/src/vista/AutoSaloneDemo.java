package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.RegistroController;
import veicoli.AutoElettrica;
import veicoli.Automobile;
import veicoli.Moto;
import veicoli.Veicolo;

public class AutoSaloneDemo {

	public static void main(String[] args) throws FileNotFoundException {


		RegistroController ctrl = new RegistroController();
		
		Scanner input = new Scanner(new File("files/auto.csv")); 
		
		while (input.hasNextLine()) {
			String rigaFile = input.nextLine();
			String[] pezziDiRIga = rigaFile.split(",");
			String marca = pezziDiRIga[0].replaceAll("\"", "");
			System.out.println(marca);
		}
		
		ctrl.addVeicolo(new Moto("Yamaha", "MT09", 850, 6000));
		ctrl.addVeicolo(new Automobile("Fiat", "Panda", 1200, 2000));
		ctrl.addVeicolo(new Automobile("Fiat", "Punto", 1400, 2500));
		ctrl.addVeicolo(new Automobile("Toyota", "Yaris", 1300, 2200));
		ctrl.addVeicolo(new Automobile("BMW", "X5", 2500, 12000));
		ctrl.addVeicolo(new AutoElettrica("toyota", "prius", 1800, 3000));
		
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
