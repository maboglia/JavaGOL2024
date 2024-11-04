package model;

public class Rettangolo extends FormaGeometrica {

	protected Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;

		this.nome = "Rettangolo";
//		this.perimetro = getPerimetro();
//		this.area = getArea();
	}

	@Override
	public double getPerimetro() {
		
		return 2 * (base.lunghezza() + altezza.lunghezza());
	}

	@Override
	public double getArea() {
		
		return base.lunghezza() * altezza.lunghezza();
	}

}
