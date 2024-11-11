package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private Connection conn = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "java";
	private final String PASS = "java";
	
	public Connection getConn() {
		
		if (conn == null) {
			connetti();
		}
		
		return conn;
	}
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso al DB");
		} catch (SQLException e) {
			
			System.err.println("Non sei connesso al db per: " + e.getMessage());
			
		}
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
}
