<%@page import="java.util.Random"%>
<%

	Random r = new Random();
	String titolo = "Tombola di natale, è uscito il: "; 

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= titolo %></title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<% 
		for(int i = 1; i<=6; i++) {

		
	%>

	 <h<%=i%>><%= titolo %> <%= r.nextInt(1, 91) %></h<%=i%>>
	
	<%
		}
	%>
<script type="text/javascript" src="./js/script.js"></script>

</body>
</html>