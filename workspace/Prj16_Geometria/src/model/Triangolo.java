package model;

public class Triangolo extends FormaGeometrica {

	private Punto a, b, c;
	private Segmento ab,ac, bc;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		this.nome = "Triangolo";
//		this.area = getArea();
//		this.perimetro = getPerimetro();
	}
	
	public double getPerimetro() {
		return ab.lunghezza() + bc.lunghezza() + ac.lunghezza();
	}
	
	public double getArea() {
		double sp = getPerimetro() / 2;
		return Math.sqrt(
				sp * 
					(sp - ab.lunghezza() ) * 
					(sp - ac.lunghezza() ) * 
					(sp - bc.lunghezza() )  
				);
	}
	
}
