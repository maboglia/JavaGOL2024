package libreria;

public class Libro {

	private String titolo;
	private String autore;
	private int pagine;
	
	public Libro(String _titolo, String _autore, int _pagine) {
		titolo = _titolo;
		autore = _autore;
		pagine = _pagine;
	}
	
	public String schedaLibro() {
		return 
				"Titolo: " + titolo + "\n" +
				"Autore: " + autore + "\n" +
				"Pagine: " + pagine ;
	}
	
	
	public String schedaLibroHtml() {
		return 
				"<li>Titolo: " + titolo + "</li>";
	}
}
