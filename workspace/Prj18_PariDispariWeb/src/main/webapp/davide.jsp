<%@ include file="logica.jsp" %>


<!DOCTYPE html>
<%@page import="giochi.PariDispari"%>
<html>
<head>
<meta charset="UTF-8">
<title>Gioca</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<h1>Gioca a Pari o dispari</h1>

	<div id="pari">
		<a href="?sceltaUmano=pari">Pari</a>
	</div>

	<div id="dispari">
		<a href="?sceltaUmano=dispari">Dispari</a>
	</div>

	<div id="sceltaUmano">
		<h2><%= sceltaUmano %></h2>
	</div>

	<div id="sceltaMacchina">
		<h2><%= sceltaMacchina %></h2>
	</div>
	
	<div id="ditaUmano">
		<a href="?sceltaUmano=pari&ditaUmano=1">1</a> 
		<a href="?sceltaUmano=pari&ditaUmano=2">2</a> 
		<a href="?sceltaUmano=pari&ditaUmano=3">3</a> 
		<a href="?sceltaUmano=pari&ditaUmano=4">4</a> 
		<a href="?sceltaUmano=pari&ditaUmano=5">5</a> 
	</div>

	<div id="ditaUmano">
		<h2><%= ditaUmano %></h2>
	</div>
	<div id="ditaMacchina">
		<h2><%= ditaMacchina %></h2>
	</div>
	<div id="risultato">
		<h2><%= risultato %></h2>
	</div>

</body>
</html>