package view;

import model.Studente;

public class StudentView {

	private Studente studente;

	public StudentView(Studente studente) {
		this.studente = studente;
	}
	
	public String getCard() {
		
		return "<div>"
				+ "<h1>" + studente.getNome() + "</h1>"
				+ "<h2>" + studente.getCognome() + "</h2>"
				+ "</div>"
				;
		
	}
	
	
	
}
