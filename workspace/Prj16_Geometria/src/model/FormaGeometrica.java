package model;

public abstract class FormaGeometrica {

	protected String nome;
//	protected double perimetro;
//	protected double area;
	
	public abstract double getPerimetro();
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "FormaGeometrica [nome=" + nome + ", perimetro=" + getPerimetro()  + ", area=" + getArea() + "]";
	}
	
	
	
}
