package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Scienziati {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("files/scienziati_01.txt");
		File pulito = new File("files/scienziati_puliti.md");
		
		PrintWriter output = new PrintWriter(pulito);
		
		Scanner input = new Scanner(f);
		
		while(input.hasNextLine()) {
			String riga = input.nextLine();
			String[] parole = riga.split(";");
			
			output.println("## " + parole[1]);
			
			//System.out.println(parole[1]);
		}
		output.close();
	}

}
