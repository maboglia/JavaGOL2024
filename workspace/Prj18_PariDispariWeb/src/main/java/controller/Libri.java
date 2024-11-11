package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/libri", "/books"})
public class Libri extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest richiesta, 
			HttpServletResponse risposta) 
					throws ServletException, IOException {
		
		risposta.setContentType("text/html");
		risposta
			.getWriter()
			.println("{ \"titolo\" : \"zanna bianca\" }");
		
	}

	
	
}
