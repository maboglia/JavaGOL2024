
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<h1>Libri</h1>

<form method="post" action="libri">
	<input class="form-control" type="text" name="titolo" placeholder="titolo"><br>
	<input class="form-control" type="text" name="autore" placeholder="autore"><br>
	<input class="form-control" type="text" name="prezzo" placeholder="prezzo"><br>
	<button class="btn btn-success">Add Libro</button>
</form>

<table class="table table-striped">
	<tr>
		<th>Titolo</th>
		<th>Autore</th>
		<th>Prezzo</th>
	</tr>
	<%
	List<Libro> libri = (List<Libro>) request.getAttribute("libri");
	%>
	<%
	for (Libro l : libri) {
	%>

	<tr>
		<td><%= l.getTitolo() %></td>
		<td><%= l.getAutore() %></td>
		<td><%= l.getPrezzo() %></td>
	</tr>
	<%
	}
	%>

</table>

