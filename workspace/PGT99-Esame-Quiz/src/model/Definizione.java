package model;

public class Definizione {
	private int id;
	private String vocabolo;
	private String vocaboloTradotto;
	private String frase;
	private String fraseTradotta;
	
	
	public Definizione(int id, String vocabolo, String vocaboloTradotto, String frase, String fraseTradotta) {
		this.id = id;
		this.vocabolo = vocabolo;
		this.vocaboloTradotto = vocaboloTradotto;
		this.frase = frase;
		this.fraseTradotta = fraseTradotta;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVocabolo() {
		return vocabolo;
	}


	public void setVocabolo(String vocabolo) {
		this.vocabolo = vocabolo;
	}


	public String getVocaboloTradotto() {
		return vocaboloTradotto;
	}


	public void setVocaboloTradotto(String vocaboloTradotto) {
		this.vocaboloTradotto = vocaboloTradotto;
	}


	public String getFrase() {
		return frase;
	}


	public void setFrase(String frase) {
		this.frase = frase;
	}


	public String getFraseTradotta() {
		return fraseTradotta;
	}


	public void setFraseTradotta(String fraseTradotta) {
		this.fraseTradotta = fraseTradotta;
	}


	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("Vocabolo: ");
		sb.append(vocabolo);
		sb.append("\n");
		sb.append("Traduzione: ");
		sb.append(vocaboloTradotto);
		sb.append("\n");
		
		sb.append("Frase: ");
		sb.append(frase);
		
		sb.append("\n");
		sb.append("Traduzione frase: ");
		sb.append(fraseTradotta);
		
		
		return sb.toString();
	}

	


}
