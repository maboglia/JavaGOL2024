package libreria;

public class Scaffale {

	private Libro[] libri = new Libro[1000];
	
	public void addLibro(Libro libro, int pos) {
		if (pos >= 0 && pos < libri.length  )
			libri[pos] = libro;
	}
	
	public void addLibro(Libro libro) {
		
		int pos = trovaPosizione();
		
		if(pos > -1) {
			addLibro(libro, pos);
		}
		
	}
	
	private int trovaPosizione() {

		for (int i = 0; i < libri.length; i++) {
			if (libri[i] == null)
				return i;
		} 
		return -1;
	}
	
	public Libro[] getLibri() {
		return libri;
	}
	
}
