package veicoli;

public class Moto extends Veicolo{

	public Moto(String marca, String modello, int cilindrata, int prezzo) {
		super(marca, modello, cilindrata, prezzo);
	}
	
	@Override
	public String toString() {
		return "Moto [marca=" + this.getMarca() + ", modello=" + modello + ", cilindrata=" + cilindrata + ", prezzo=" + prezzo
				+ "]";
	}
	
	
}
