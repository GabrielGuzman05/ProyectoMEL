<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Estudio List</title>
</head>
<body>
<center>
<h1>Estudio List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdEstudio(PK)</td>
		<td>Nombre</td>
		<td></td>
	</tr>
<%
ORM.Estudio[] estudios = ORM.EstudioDAO.listEstudioByQuery(null, null);
for(int i = 0; i < estudios.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(estudios[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(estudios[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Estudio.jsp?action=search&idEstudio=");
		out.print(estudios[i].getORMID());
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
<a href="Estudio.jsp">Add Estudio</a>
</center>
</body>
</html>
