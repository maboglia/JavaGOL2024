package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.FormaGeometrica;

public class Piastrellista {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<FormaGeometrica> stanze = new ArrayList<>();
		
		System.out.println("Dimmi la forma della stanza (t,r,q)");
		String forma = input.nextLine();
		
		switch (forma) {
		case "r", "R":
			System.out.println("Dammi le coordinate ");
			
			break;

		default:
			break;
		}
		

	}

}
