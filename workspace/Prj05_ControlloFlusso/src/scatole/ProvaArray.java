package scatole;

public class ProvaArray {

	public static void main(String[] args) {
		
		/*
		int[] voti = new int[10];
		
		voti[0] = 25;
		voti[1] = 25;
		voti[2] = 18;
		voti[3] = 23;
		*/
		//             0  1  2  3  
		int[] voti = {25,28,29,16,15,15,28,29};
		
		int totale = 0;
		
		for (int i = 0; i < voti.length; i++) {
			totale += voti[i]; 
		}
		
		System.out.println("Il totale dei voti è " + totale);
		double media =  (double) totale / voti.length;
		System.out.println("La media è: " + media);
		
	}

}
