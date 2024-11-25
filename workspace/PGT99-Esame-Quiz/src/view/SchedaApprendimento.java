package view;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.Definizione;
import service.QuizService;
import util.FileUtil;

public class SchedaApprendimento {

	public static void main(String[] args) {
		
		//leggo file con le definizioni e acquisisco le singole righe come stringhe
		File fIn = new File("C:\\Users\\teacher\\Downloads\\dict-ita-eng.tsv");
		ArrayList<String> righeLette = FileUtil.readRows(fIn);	
		
		//costruisco un set di quiz utilizzando il servizio e il metodo appropriato	
		QuizService service=new QuizService();
		service.produciQuiz(righeLette);		
		ArrayList<Definizione> quizzes =service.getQuizzes();
		
		
		//interazione con l'utente
		//apprendimento semplice: viene proposta una scheda alla volta
	    System.out.println("Premi invio per una nuova scheda, altrimenti digita stop");
	    Scanner input = new Scanner(System.in);
	    int numeroSchede=0;
	    while (true) {
	        String line = input.nextLine();
	        if ("stop".equalsIgnoreCase(line)) {
	            break;
	        }
	        
	        int randomId= (int)( Math.random()*quizzes.size());	        
	        Definizione defScelta=quizzes.get(randomId);	        
	        System.out.println(defScelta);     
	        numeroSchede++;
	    }
	    
	    System.out.println("\nhai terminato l'apprendimento, hai imparato: " + numeroSchede+ " schede");

	}	


}
