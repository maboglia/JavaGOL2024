package repos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl implements LibroDAO {

	Connessione c = new Connessione();
	private Connection conn = null;
	private Statement statement = null;
	private ResultSet risultati = null;
	
	public LibroDAOImpl() {
		//System.out.println(c.getConn());
	}
	
	@Override
	public Libro findLibroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findAll() {
		
		List<Libro> libri = new ArrayList<>();
		this.conn = c.getConn();
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
		
		try {
			this.statement = this.conn.createStatement();
			String sql = "INSERT INTO libri (titolo, autore, prezzo) VALUES ('"+l.getTitolo()+"', '"+l.getAutore()+"',"+l.getPrezzo()+" )";
			this.statement.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
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
