package model;

public class Libro {

	private String titolo;
	private String autore;
	private int pagine;
	private String editore;
	private double prezzo;
	
	public Libro(String titolo, String autore, int pagine, String editore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
		this.editore = editore;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", editore=" + editore
				+ ", prezzo=" + prezzo + "]";
	}
	
	
	
}
