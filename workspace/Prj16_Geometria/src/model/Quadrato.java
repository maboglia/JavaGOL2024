package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
		System.out.println(lato);
		this.nome = "Quadrato";
//		this.perimetro = getPerimetro();
//		this.area = getArea();
		
	}

	@Override
	public double getArea() {
		System.out.println("Uso il metodo del quadrato");
		return Math.pow(lato.lunghezza(), 2);
	}
	
	

}
