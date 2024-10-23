package demo;

import java.util.Scanner;

import calc.Calculator;

public class CalcDemo1 {

	public static void main(String[] args) {
		
		int numero1 = leggiIntero();
		int numero2 = leggiIntero();
		
		int addizione = Calculator.addizione(numero1, numero2);
		System.out.printf("Il risultato dell'addizione è %d", addizione);
		System.out.println();
		
		int sottrazione = Calculator.sottrazione(numero1, numero2);
		System.out.printf("Il risultato dell'sottrazione è %d", sottrazione);
		System.out.println();
		
		int moltiplicazione = Calculator.moltiplicazione(numero1, numero2);
		System.out.printf("Il risultato della moltiplicazione è %d", moltiplicazione);
		System.out.println();
		
		double divisione = Calculator.divisione(numero1, numero2);
		System.out.printf("Il risultato della divisione è %f", divisione);
		
	}

	private static int leggiIntero() {
		Scanner canon3212 = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		return canon3212.nextInt();
	}

}
