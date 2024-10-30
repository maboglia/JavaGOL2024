<%@page import="controller.LibroController"%>
<%@page import="model.Libro"%>
<% 

if (request.getParameter("titolo") != null){
	
	String titolo = request.getParameter("titolo");
	String autore = request.getParameter("autore");
	String pagine = request.getParameter("pagine");
	String prezzo = request.getParameter("prezzo");
	
	Libro l = new Libro(); 
	l.setTitolo(titolo);
	l.setAutore(autore);
	l.setPagine(Integer.parseInt(pagine));
	l.setPrezzo(Double.parseDouble(prezzo));
	
	LibroController.addLibro(l);
	
	response.sendRedirect("libri.jsp");
}






%>