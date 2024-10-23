package main;

/**
 * Classe Utente definisce un utente tipo nel programma
 */
public class Utente {

	/**
	 * username inserire qui il nickname dell'utente
	 */
	private String username;
	/**
	 * password inserire la password dell'utente
	 */
	private String password;
	
	/**
	 * Costruttore dell'utente
	 * @param nomeUtente - inserire il nome utente
	 */
	public Utente(String nomeUtente) {
		username = nomeUtente;
		password = nomeUtente.toUpperCase() + 2024;
	} 
	
	public boolean checkLogin(String user, String pw) {
		if (  username.equals(user) && password.equals(pw)   ) {
			return true;
		}
		return false;
	}
	
	
}
