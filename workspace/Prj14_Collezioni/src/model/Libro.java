package model;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

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

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autore, pagine, prezzo, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autore, other.autore) && pagine == other.pagine
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo)
				&& Objects.equals(titolo, other.titolo);
	}

	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		return Double.compare(this.prezzo, altroLibro.prezzo);
	}
	
	
	
}
