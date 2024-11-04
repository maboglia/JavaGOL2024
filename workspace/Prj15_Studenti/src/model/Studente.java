package model;

import java.time.LocalDate;

public class Studente extends Object {

	//incapsulamento: proprietà private, metodi accessori pubblici
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	
	//costruttore: metodo che inizializza le proprietà dell'obj
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		System.out.println("Studente costruito");
	}

	//overload: diversi metodi con lo stesso nome, ma parametri diversi per numero, posizione o tipo
	public Studente(String nome, String cognome, LocalDate dataNascita) {
		this(nome, cognome);
		this.dataNascita = dataNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + "]";
	}

	
	
	
}
