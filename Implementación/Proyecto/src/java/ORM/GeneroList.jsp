<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Genero List</title>
</head>
<body>
<center>
<h1>Genero List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdGenero(PK)</td>
		<td>Nombre</td>
		<td>Descripcion</td>
		<td></td>
	</tr>
<%
ORM.Genero[] generos = ORM.GeneroDAO.listGeneroByQuery(null, null);
for(int i = 0; i < generos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(generos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(generos[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(generos[i].getDescripcion());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Genero.jsp?action=search&idGenero=");
		out.print(generos[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Genero.jsp">Add Genero</a>
</center>
</body>
</html>
