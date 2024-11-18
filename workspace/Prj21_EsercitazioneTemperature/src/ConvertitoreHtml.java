import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTML;

public class ConvertitoreHtml {

	public static void main(String[] args) {
		final String PATH = "\\\\fs-aule\\2025\\B22-166-2024\\";
		String csvFilePath = PATH + "temperature.csv"; // Percorso del file CSV
		 String htmlFilePath = PATH + "temperature.html"; // Percorso del file HTML generato
		 // Legge i dati dal CSV
		 List<String[]> data = readCSV(csvFilePath);
		 // Genera il file HTML
		 generateHTML(data, htmlFilePath);
		 System.out.println("File HTML generato con successo: " +
		htmlFilePath);
		 }
		 // Metodo per leggere i dati dal file CSV
		 public static List<String[]> readCSV(String filePath) {
		 List<String[]> data = new ArrayList<>();
		 try (    BufferedReader br = Files.newBufferedReader(Paths.get(filePath))      ) {
		 String line;
		 while ((line = br.readLine()) != null) {
		 String[] row = line.split(","); // Divide i dati per colonna
		 data.add(row);
		 }
		 } catch (IOException e) {
		 System.err.println("Errore nella lettura del file CSV: " +
		e.getMessage());
		 }
		 return data;
		 }
		 // Metodo per generare il file HTML
		 public static void generateHTML(List<String[]> data, String filePath)
		{
		 try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath))) {
		 // Scrive l'intestazione dell'HTML
		 bw.write("<!DOCTYPE html>\n");
		 bw.write("<html lang=\"en\">\n");
		 bw.write("<head>\n");
		 bw.write("<meta charset=\"UTF-8\">\n");
		 bw.write("<meta name=\"viewport\" content=\"width=devicewidth, initial-scale=1.0\">\n");
		 bw.write("<title>Temperature Città Europee</title>\n");
		 bw.write("<style>\n");
		 bw.write("table { border-collapse: collapse; width: 100%;}\n");
		 bw.write("th, td { border: 1px solid #ddd; padding: 8px; textalign: left; }\n");
		 bw.write("th { background-color: #f4f4f4; }\n");
		 bw.write("</style>\n");
		 bw.write("</head>\n");
		 bw.write("<body>\n");
		 bw.write("<h1>Temperature nelle principali città europee</h1>\n");
		 bw.write("<table>\n");
		 // Scrive la riga di intestazione
		 if (!data.isEmpty()) {
		 bw.write("<tr>\n");
		 for (String header : data.get(0)) {
		 bw.write("<th>" + header + "</th>\n");
		 }
		 bw.write("</tr>\n");
		 }
		 // Scrive i dati
		 for (int i = 1; i < data.size(); i++) { // Ignora la riga di intestazione
		 bw.write("<tr>\n");
		 for (String cell : data.get(i)) {
		 bw.write("<td>" + cell + "</td>\n");
		 }
		 bw.write("</tr>\n");
		 }
		 // Chiude la tabella e il file HTML
		 bw.write("</table>\n");
		 bw.write("</body>\n");
		 bw.write("</html>");
		 } catch (IOException e) {
		 System.err.println("Errore nella scrittura del file HTML: " +
		e.getMessage());
		 }
		 }


}
