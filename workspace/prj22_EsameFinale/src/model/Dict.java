package model;

public class Dict {
	/*
	 * 	Numero identificativo (int)
		Vocabolo in inglese (String)
		Traduzione italiana (String)
		Frase di esempio in inglese (String)
		Traduzione della frase (String)
	 */
	
	private int id;
	private String vocaboloEng;
	private String vocaboloIta;
	private String fraseExEng;
	private String fraseExIta;
	
	public Dict(int id, String vocaboloEng, String vocaboloIta, String fraseExEng, String fraseExIta) {
		this.id = id;
		this.vocaboloEng = vocaboloEng;
		this.vocaboloIta = vocaboloIta;
		this.fraseExEng = fraseExEng;
		this.fraseExIta = fraseExIta;
	}

	public Dict(String vocaboloEng, String vocaboloIta, String fraseExEng, String fraseExIta) {
		super();
		this.vocaboloEng = vocaboloEng;
		this.vocaboloIta = vocaboloIta;
		this.fraseExEng = fraseExEng;
		this.fraseExIta = fraseExIta;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVocaboloEng() {
		return vocaboloEng;
	}
	public void setVocaboloEng(String vocaboloEng) {
		this.vocaboloEng = vocaboloEng;
	}
	public String getVocaboloIta() {
		return vocaboloIta;
	}
	public void setVocaboloIta(String vocaboloIta) {
		this.vocaboloIta = vocaboloIta;
	}
	public String getFraseExEng() {
		return fraseExEng;
	}
	public void setFraseExEng(String fraseExEng) {
		this.fraseExEng = fraseExEng;
	}
	public String getFraseExIta() {
		return fraseExIta;
	}
	public void setFraseExIta(String fraseExIta) {
		this.fraseExIta = fraseExIta;
	}

	@Override
	public String toString() {
		return "****************************************************" + "\n" + 
				"Vocabolo: " + vocaboloEng + "\n" + 
				"Traduzione:" + vocaboloIta + "\n" + 
				"Esempio:" + fraseExEng + "\n" + 
				"Traduzione frase:" + fraseExIta +"\n" + 
				"****************************************************" ;
	}
	
	
	
	
	
}
