package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import giochi.PariDispari;

/**
 * Servlet implementation class Gioco1
 */
@WebServlet("/search")
public class Gioco1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gioco1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response
//			.getWriter()
//			.append("Ciao dalla servlet :) " + PariDispari.sceltaMacchina());
	
		request.getRequestDispatcher("header.jsp").include(request, response);

		
		request.getRequestDispatcher("pagina1.jsp").include(request, response);
		
		if (request.getParameter("test")!=null) {
			response.getWriter().print("<h3>"+request.getParameter("test") + "</h3>");
		}
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
		
		//response.sendRedirect("davide.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
