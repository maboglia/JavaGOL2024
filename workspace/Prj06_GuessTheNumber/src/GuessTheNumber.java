import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		int numeroSegreto = (int)(Math.random() * 100) + 1;
		boolean gira = true;
		int tentativi = 0;
		
		while(gira) {
			int leggiIntero = leggiIntero();
			tentativi++;
			
			if (leggiIntero == numeroSegreto) {
				System.out.println("Hai vinto");
				gira = false;
			} else {
				System.out.println("NON hai vinto");
				if(leggiIntero < numeroSegreto) {
					System.out.println("Troppo basso");
				} else {
					System.out.println("Troppo alto");
				}
			}
			
			
			
		}
		System.out.printf("Hai impiegato %d tentativi", tentativi);

	}

	private static int leggiIntero() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero intero tra 0 e 100");
		return input.nextInt();
	}

}
