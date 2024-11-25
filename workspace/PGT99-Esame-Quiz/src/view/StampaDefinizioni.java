package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.classfile.ClassFile.DeadCodeOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Definizione;
import util.FileUtil;

public class StampaDefinizioni {

	public static void main(String[] args) throws FileNotFoundException {

		File fIn = new File("files/dict-ita-eng.tsv");
		File fOut = new File("files/quiz.html");

		ArrayList<String> righeLette = FileUtil.readRows(fIn);
		ArrayList<String> outputHtml = new ArrayList<String>();

		ArrayList<Definizione> quizzes = new ArrayList<>();

		produciQuiz(righeLette, quizzes);

		outputHtml.add(buildHeader("Quiz"));
		outputHtml.add(buildTable(quizzes));
		outputHtml.add(buildFooter());
		
		FileUtil.writeRows(outputHtml, fOut);
		System.out.println("file creato");

	}


	private static void produciQuiz(ArrayList<String> righeLette, ArrayList<Definizione> quizzes)
			throws NumberFormatException {
		for (String riga : righeLette) {
			String[] split = riga.split("\t");

			int id = Integer.parseInt(split[0]);
			String vocabolo = split[1];
			String vocaboloTradotto = split[2];
			String frase = split[3];
			String fraseTradotta = split[4];

			
			quizzes.add(new Definizione(id, vocabolo, vocaboloTradotto, frase, fraseTradotta));
		}
	}

	
	
	private static String buildHeader(String titolo) {
		StringBuilder header = new StringBuilder();
		header.append("<html>");
		header.append("<head>");
		header.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");

		header.append("<link rel=\"stylesheet\" href=\"style.css\"> ");

		header.append("</head>");
		header.append("<body>");
		header.append("<h1>");
		header.append(titolo);
		header.append("</h1>");
		return header.toString();
	}

	private static String buildTable(ArrayList<Definizione> definizioni) {
		StringBuilder table = new StringBuilder();
		table.append("<table class=\"table table-striped w-auto\" >");
		
		table.append("<thead><tr><th>id</th>");
		table.append("<th>vocabolo</th>");
		table.append("<th>traduzione</th>");
		table.append("<th>frase</th>");
		table.append("<th>frase tradotta</th>");
		table.append("</tr></thead>");
		
		table.append("<tbody>");

		for (Definizione dato : definizioni) {
			table.append("<tr>");

			table.append("<td>");
			table.append(dato.getId());
			table.append("</td>");

			table.append("<td>");
			table.append(dato.getVocabolo());
			table.append("</td>");
			
			table.append("<td>");
			table.append(dato.getVocaboloTradotto());
			table.append("</td>");
			
			table.append("<td>");
			table.append(dato.getFrase());
			table.append("</td>");
			
			table.append("<td>");
			table.append(dato.getFraseTradotta());
			table.append("</td>");		
			
			
			table.append("</tr>");
		}
		
		table.append("</tbody></table>");
		return table.toString();
	}

	private static String buildFooter() {
		StringBuilder footer = new StringBuilder();
		footer.append("</body>");
		footer.append("</html>");
		return footer.toString();
	}
}
