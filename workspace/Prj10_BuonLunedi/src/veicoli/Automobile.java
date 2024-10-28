package veicoli;

public class Automobile extends Veicolo{


	public Automobile(String marca, String modello, int cilindrata, int prezzo) {
		super(marca, modello, cilindrata, prezzo);
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", prezzo="
				+ prezzo + "]";
	}
	
	
	
}
