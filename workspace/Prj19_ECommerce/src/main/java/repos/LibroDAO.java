package repos;

import java.util.List;

import model.Libro;

public interface LibroDAO {

	Libro findLibroById(int id);
	List<Libro> findAll();
	
	Libro addLibro(Libro l); 
	Libro updateLibro(Libro l);
	void deleteLibro(Libro l);
	void deleteLibroById(int id);
	
}
