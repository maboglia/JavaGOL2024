package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {

		String parole = "   Acqua, biscotti, the, limone, mandarino   ";
		
		String saluto = new String("Hello, World");
		
		System.out.println(parole.toUpperCase());
		System.out.println(parole.toLowerCase().repeat(10));
		System.out.println(parole.length());
		parole = parole.trim();
		System.out.println(parole.length());
		

	}

}
