package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileUtil {

	public static ArrayList<String> readRows(File nomeFile) {
		ArrayList<String> righe = new ArrayList<>();

		try {
			Scanner input = new Scanner(nomeFile);
			input.nextLine();//ignoro la prima riga con le intestazioni
			while (input.hasNextLine()) {
				String riga = input.nextLine();
				righe.add(riga);
			}

		} catch (FileNotFoundException e) {
			System.err.println("File non trovato");
		}
		return righe;
	}

	public static void writeRows(ArrayList<String> contenuto, File destinazione) {
		try {
			PrintWriter output = new PrintWriter(destinazione);

			for (String riga : contenuto) {
				output.println(riga);
			}

			output.close();

		} catch (FileNotFoundException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	public static void writeLog(StringBuilder contenuto, File destinazione) {
		try {
			PrintWriter output = new PrintWriter(destinazione);
			output.append(contenuto);
			output.close();

		} catch (FileNotFoundException e) {
			System.err.println();
			e.printStackTrace();
		}
	}





}
