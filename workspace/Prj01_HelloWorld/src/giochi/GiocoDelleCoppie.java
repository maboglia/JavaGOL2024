package giochi;

public class GiocoDelleCoppie {

	public static void main(String[] args) {

		Dado dado1 = new Dado();// costruito
		Dado dado2 = new Dado();// costruito
		final int NUM_LANCI = 1000_000;
		int vittorie = 0;

		for (int i = 0; i < NUM_LANCI; i++) {

			int result1 = dado1.lancia();
			int result2 = dado2.lancia();

			//System.out.println("Il dado 1 vale " + result1);
			//System.out.println("Il dado 2 vale " + result2);

			if (result1 == result2) {
				vittorie++;
				//System.out.println("HAI VINTO!!!");
			}
		}//fine ciclo for
		
		System.out.println("Hai vinto " + vittorie + " volte");

	}

}
