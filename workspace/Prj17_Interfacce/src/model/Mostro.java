package model;

public abstract class Mostro implements Spaventoso {

	public String nome;
	public String tipo;
	
	public abstract void faPaura();
	
	@Override
	public String toString() {
		return "Mostro [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
	
	
}
