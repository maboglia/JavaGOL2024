package contratti;

public class Lavoratore implements ContrattoUno {

	@Override
	public void clausola1() {
		System.out.println("Rispetto della regola n 1");

	}

	@Override
	public void clausola2(String nomePersona) {
		System.out.println("Rispetto della regola n 2");
		System.out.println("Firma " + nomePersona);
	}

	

}
