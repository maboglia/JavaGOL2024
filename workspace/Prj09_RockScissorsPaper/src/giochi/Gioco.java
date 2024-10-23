package giochi;

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {
		
		String umano = chiediAllUmano();
		String macchina = chiediAllaMacchina();
		String risultato = valutaRisultato(umano, macchina);
		System.out.println(risultato);
	}

	private static String valutaRisultato(String umano, String macchina) {
		String result = "Pareggio";
		
		if (umano.equals(macchina)) {
			
		} else {
			if (umano.equals("P") ) {
				if (macchina.equals("F")) result="Vince Umano";
				else result = "Vince Macchina";
			}
			if (umano.equals("F") ) {
				if (macchina.equals("C")) result="Vince Umano";
				else result = "Vince Macchina";
			}
			if (umano.equals("C") ) {
				if (macchina.equals("P")) result="Vince Umano";
				else result = "Vince Macchina";
			}
		}
		
		return result;
	}

	private static String chiediAllaMacchina() {
		double casuale = Math.random();
		if (casuale < 0.3) {
			return "P";
		} else if (casuale < 0.6) {
			return "F";
		} else {
			return "C";
		}
	}

	private static String chiediAllUmano() {
		Scanner input = new Scanner(System.in);
		System.out.println("Umano! Scegli tra (P)ietra, (F)orbici, (S)asso");
		return input.next();
	}
	
}
