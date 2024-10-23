package main;

import java.util.Scanner;

public class UtenteDemo {

	public static void main(String[] args) {
		//creo 2 istanze di utente
		Utente u1 = new Utente("mauro");
		Utente u2 = new Utente("gianluca");
		
		//creo un'istanza di scanner
		Scanner input = new Scanner(System.in);
		
		//faccio domande all'utente
		System.out.println("Inserisci le credenziali");
		System.out.println("username:");
		//registro la risposta dell'utente
		String user = input.nextLine();
		System.out.println("password:");
		//registro la risposta dell'utente
		String pass = input.nextLine();
		
		//chiamo il metodo checkLogin
		boolean logged = u1.checkLogin(user, pass);
		
		if(logged) {
			System.out.println("Sei dentro!");
		} else {
			System.out.println("User o PW errati");
		}
		
		
		
		
	}

}
