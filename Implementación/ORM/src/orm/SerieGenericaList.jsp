<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>SerieGenerica List</title>
</head>
<body>
<center>
<h1>SerieGenerica List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdSerie(PK)</td>
		<td>Nombre</td>
		<td>NombreAlternativo</td>
		<td>EstadoUsuarioidEstadoUsuario</td>
		<td>Cadena</td>
		<td>Episodios</td>
		<td></td>
	</tr>
<%
ORM.SerieGenerica[] serieGenericas = ORM.SerieGenericaDAO.listSerieGenericaByQuery(null, null);
for(int i = 0; i < serieGenericas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(serieGenericas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(serieGenericas[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(serieGenericas[i].getNombreAlternativo());
		out.println("</td>");
		out.print("<td>");
		out.print(serieGenericas[i].getEstadoUsuarioidEstadoUsuario());
		out.println("</td>");
		out.print("<td>");
		out.print(serieGenericas[i].getCadena());
		out.println("</td>");
		out.print("<td>");
		out.print(serieGenericas[i].getEpisodios());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"SerieGenerica.jsp?action=search&idSerie=");
		out.print(serieGenericas[i].getORMID());
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
<a href="SerieGenerica.jsp">Add SerieGenerica</a>
</center>
</body>
</html>
