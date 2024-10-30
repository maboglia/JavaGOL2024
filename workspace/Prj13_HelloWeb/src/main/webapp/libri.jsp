<!DOCTYPE html>
<%@page import="controller.LibroController"%>
<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Libri</h1>
	
	<form action="addLibro.jsp" method="post">
		<input type="text" name="titolo" placeholder="titolo">
		<br>
		<input type="text" name="autore" placeholder="autore">
		<br>
		<input type="number" name="pagine" placeholder="pagine">
		<br>
		<input type="number" step="0.05" name="prezzo" placeholder="prezzo">
		<br>
		<input type="submit" value="Add Libro">
	</form>
	
	<% //LibroController.init(); %>
	<% ArrayList<Libro> libri = LibroController.getLibri(); %>
	
	<ul>
		<% for (Libro l : libri){ %>
			<li><%= l.getTitolo() %></li>
		<% } %>
	</ul>

</body>
</html>