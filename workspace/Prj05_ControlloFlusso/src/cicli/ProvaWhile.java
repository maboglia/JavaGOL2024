package cicli;

public class ProvaWhile {

	public static void main(String[] args) {

		boolean gira = true;
		
		int giri = 0;
		
		while(gira) {
			
			giri++;
			
			System.out.println("Il ciclo ha girato " + giri);
			
			double casuale = Math.random();
			
			System.out.println("Numero casuale è " + casuale);
			
			if (casuale < 0.001) {
				gira = false;
			}
		}
		
		System.out.println("GAME OVER");
		
		
	}

}
