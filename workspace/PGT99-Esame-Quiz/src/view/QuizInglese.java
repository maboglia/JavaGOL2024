package view;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import model.Definizione;
import service.QuizService;
import util.FileUtil;

public class QuizInglese {

	public static void main(String[] args) {

		// leggo file con le definizioni e acquisisco le singole righe come stringhe
		File fIn = new File("C:\\Users\\teacher\\Downloads\\dict-ita-eng.tsv");
		//file in cui riporto il risultato del quiz
		File fOut = new File("C:\\Users\\teacher\\Downloads\\reportQuiz.txt");
		ArrayList<String> righeLette = FileUtil.readRows(fIn);

		// costruisco un set di quiz utilizzando il servizio e il metodo appropriato (futuro: sottoinsieme di domande)
		QuizService service = new QuizService();
		service.produciQuiz(righeLette);
		ArrayList<Definizione> quizzes = service.getQuizzes();
		
		//struttura dati per memorizzare le stringhe di log
		StringBuilder log = new StringBuilder();
		

		// memorizzo il numero di risposte corrette
		int punteggio = 0;
		//memorizzo il numero di domande fatte
		int domande=0;

		while (true) {
			// produco 3 id casuali diversi tra tutte le definizioni
			// usando Math.random.nextInt avrei potuto averli anche uguali? nel dubbio...
			int numberofQuizzes = service.getNumberOfQuizzes();
			List<Integer> digits = IntStream.range(1, numberofQuizzes).boxed().collect(Collectors.toList());
			// shuffle the List
			Collections.shuffle(digits);
			// take the first 3 elements of the List
			int idVocaboliScelti[] = new int[3];
			for (int i = 0; i < 3; i++) {
				idVocaboliScelti[i] = digits.get(i);
//		    System.out.println(idVocaboliScelti[i]);
			}
			// produco un quarto numero casuale per decidere la posizione in cui mettere la
			// risposta corretta
			int posizioneRispostaCorretta = (int) (Math.random() * 4 + 1);
//		System.out.println(idRispostaCorretta);
			// propongo all'utente un vocabolo in inglese e 3 traduzioni

			String[] vocabolo1 = service.getVocaboloAndTraduzione(idVocaboliScelti[0]);
			String vocabolo2 = service.getTraduzione(idVocaboliScelti[1]);
			String vocabolo3 = service.getTraduzione(idVocaboliScelti[2]);

			List<String> vocaboli = new ArrayList<String>();
			vocaboli.add(vocabolo1[1]);
			vocaboli.add(vocabolo2);
			vocaboli.add(vocabolo3);

			Collections.shuffle(vocaboli);

			List<String> risposte = new ArrayList<String>();

			String message="Qual è la traduzione di \"" + vocabolo1[0] + "\"?";
			System.out.println(message);
			domande++;
			log.append("Domanda "+domande+": ");
			log.append(message);
			log.append("\n");
			
			
			for (int i = 0; i < 3; i++) {
				risposte.add(vocaboli.get(i));
				System.out.println(i + 1 + ") " + risposte.get(i));
			}

			// nell'array risposteTemp ho salvato l'ordine delle risposte come sono state
			// mostrate
			System.out.println("Risposta: ");
			Scanner input = new Scanner(System.in);
			int scelta = input.nextInt();
			log.append("Rsiposta utente: "+risposte.get(scelta-1) +"\n");

//		System.out.println(scelta);

//		System.out.println(risposte.get(scelta-1));
//		System.out.println(vocabolo1[1]);

			if (risposte.get(scelta - 1).equals(vocabolo1[1])) {
				System.out.println("Corretto!");
				punteggio++;
				log.append("Esito: CORRETTO\n\n");
			}
			else {
				log.append("Esito: SBAGLIATO\n\n");
			}

			System.out.println("\nPunteggio attuale: " + punteggio + "\n");
			System.out.println("Premi invio per prossima domanda? stop to quit");
			Scanner sc=new Scanner(System.in);
			String risposta = sc.nextLine();
			if ("stop".equalsIgnoreCase(risposta)) {
				break;
			}

		}
		
		// una volta uscita dal while posso produrre il file con le info memorizzate nello string array
		log.append("Punteggio totale: " + punteggio + "/" + domande);
		FileUtil.writeLog(log, fOut);
		

	}

}
