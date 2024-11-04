package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);

		this.nome = "Quadrato";
		this.perimetro = getPerimetro();
		this.area = getArea();
	}

}
