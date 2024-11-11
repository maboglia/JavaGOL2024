package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import repos.LibroDAO;
import repos.LibroDAOImpl;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LibriController
 */
@WebServlet("/libri")
public class LibriController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LibroDAO dao = new LibroDAOImpl();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LibriController() {
		System.out.println("Servlet LibriController");
		System.out.println("Quando mi hai chiamato la prima volta");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("header.jsp").include(request, response);

		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		List<Libro> libri = dao.findAll();
		request.setAttribute("libri", libri);
		
		request.getRequestDispatcher("tabella.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Libro l = new Libro();
		l.setTitolo(request.getParameter("titolo"));
		l.setAutore(request.getParameter("autore"));
		double prezzo = Double.parseDouble(request.getParameter("prezzo"));
		l.setPrezzo(prezzo);
		
		dao.addLibro(l);
		doGet(request, response);
	}

}
