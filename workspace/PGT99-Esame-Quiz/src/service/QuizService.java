package service;

import java.util.ArrayList;

import model.Definizione;

public class QuizService {

	ArrayList<Definizione> quizzes = new ArrayList<>();

	/**
	 * Dalle righe lette dal file produce la lista di definizioni. Un singolo
	 * elemento proviene da una riga del file di definizioni
	 * 
	 * @param righeLette
	 * @throws NumberFormatException
	 */

	public void produciQuiz(ArrayList<String> righeLette) throws NumberFormatException {
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

	/**
	 * REstituisce la lista di definizionie
	 * 
	 * @return
	 */
	public ArrayList<Definizione> getQuizzes() {
		return quizzes;
	}

	public String getVocabolo(int id) {

		Definizione definizione = quizzes.get(id);
		return definizione.getVocabolo();

	}
	
	public int getNumberOfQuizzes() {
		return quizzes.size();
	}
	
	
	public String getTraduzione(int id) {
		
		Definizione definizione = quizzes.get(id);
		return definizione.getVocaboloTradotto();
		
	}

	public String[] getVocaboloAndTraduzione(int id) {

		Definizione definizione = quizzes.get(id);
		String[] vocabolo = { definizione.getVocabolo(), definizione.getVocaboloTradotto() };
		return vocabolo;

	}

}
