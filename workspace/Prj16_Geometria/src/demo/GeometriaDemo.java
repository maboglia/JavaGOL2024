package demo;

import model.*;

public class GeometriaDemo {

	public static void main(String[] args) {

		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		
		FormaGeometrica t = new Triangolo(a, b, c);
		FormaGeometrica r = new Rettangolo(new Segmento(a, b), new Segmento(a, c));
		FormaGeometrica q = new Quadrato(new Segmento(a, b)); 
		System.out.println(q);
		
		
		
	}

}
