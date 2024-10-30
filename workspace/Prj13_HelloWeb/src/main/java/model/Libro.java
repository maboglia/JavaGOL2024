package model;

public class Libro {

	private String titolo;
	private String autore;
	private int pagine;
	private double prezzo;
	
	//Overload: diversi metodi NELLA STESSA CLASSE
	//con STESSO nome ma con parametri diversi per numero o per tipo
	
	public Libro() {}//come il costruttore di default
	
	public Libro(String titolo, String autore, int pagine, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
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
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
