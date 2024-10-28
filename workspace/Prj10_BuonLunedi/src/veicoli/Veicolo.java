package veicoli;

public class Veicolo {

	//stato interno
	protected String marca;
	protected String modello;
	protected int cilindrata;
	protected int prezzo;
	
	public Veicolo(String marca, String modello, int cilindrata, int prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", prezzo=" + prezzo
				+ "]";
	}
	
	
	
}
