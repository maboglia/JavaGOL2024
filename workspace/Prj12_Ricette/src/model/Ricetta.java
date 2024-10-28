package model;

public class Ricetta {

	private String nome;
	private String ingredienti;
	public Ricetta(String nome, String ingredienti) {
		super();
		this.nome = nome;
		this.ingredienti = ingredienti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	@Override
	public String toString() {
		return "Ricetta [nome=" + nome + ", ingredienti=" + ingredienti + "]";
	}
	
}
