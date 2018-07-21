<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Temporada List</title>
</head>
<body>
<center>
<h1>Temporada List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdTemporada(PK)</td>
		<td>Estacion</td>
		<td>Año</td>
		<td></td>
	</tr>
<%
ORM.Temporada[] temporadas = ORM.TemporadaDAO.listTemporadaByQuery(null, null);
for(int i = 0; i < temporadas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(temporadas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(temporadas[i].getEstacion());
		out.println("</td>");
		out.print("<td>");
		out.print(temporadas[i].getAño());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Temporada.jsp?action=search&idTemporada=");
		out.print(temporadas[i].getORMID());
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
<a href="Temporada.jsp">Add Temporada</a>
</center>
</body>
</html>
