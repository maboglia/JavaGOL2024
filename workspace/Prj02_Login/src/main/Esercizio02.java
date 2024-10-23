package main;

import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi");

		System.out.println("Primo:");
		int num1 = input.nextInt();
		
		System.out.println("Secondo");
		int num2 = input.nextInt();
		
		int addizione = num1 + num2;
		int sottrazione = num1 - num2;
		int moltiplicazione = num1 * num2;
		double divisione = (double) num1 / num2;
		
		System.out.println("Addizione " + addizione);
		System.out.println("Sottrazione " + sottrazione);
		System.out.println("Moltiplicazione " + moltiplicazione);
		System.out.println("Divisione " + divisione);
		
		
	}

}
