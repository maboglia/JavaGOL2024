package repos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl implements LibroDAO {

	private Connection conn = null;
	private Statement statement = null;
	private ResultSet risultati = null;
	
	public LibroDAOImpl() {
		Connessione c = new Connessione();
		this.conn = c.getConn();
	}
	
	@Override
	public Libro findLibroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findAll() {
		
		List<Libro> libri = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM libri";
			this.statement = this.conn.createStatement();
			this.risultati = this.statement.executeQuery(sql);
			
			while (this.risultati.next()) {
				Libro l = new Libro();
				l.setId(risultati.getInt("id"));
				l.setTitolo(risultati.getString("titolo"));
				l.setAutore(risultati.getString("autore"));
				l.setPrezzo(risultati.getDouble("prezzo"));
				libri.add(l);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return libri;
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro updateLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLibro(Libro l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLibroById(int id) {
		// TODO Auto-generated method stub

	}

}
