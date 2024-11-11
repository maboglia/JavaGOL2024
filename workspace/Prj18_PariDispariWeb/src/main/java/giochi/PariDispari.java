package giochi;

import java.util.Random;

public class PariDispari {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			System.out.println(PariDispari.sceltaMacchina());
		}
	}

	public static int sceltaMacchina() {
		Random r = new Random();
		
		return r.nextInt(1, 6);
	}
	
	public static String valutaScelte(int ditaUmano, int ditaMacchina) {
		int somma = ditaUmano + ditaMacchina;
		if (somma % 2 == 0) {
			return "pari";
		}
		return "dispari";
	}
	
}
