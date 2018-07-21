<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>TipoEmision List</title>
</head>
<body>
<center>
<h1>TipoEmision List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdTipoEmision(PK)</td>
		<td>Nombre</td>
		<td></td>
	</tr>
<%
ORM.TipoEmision[] tipoEmisions = ORM.TipoEmisionDAO.listTipoEmisionByQuery(null, null);
for(int i = 0; i < tipoEmisions.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(tipoEmisions[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(tipoEmisions[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"TipoEmision.jsp?action=search&idTipoEmision=");
		out.print(tipoEmisions[i].getORMID());
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
<a href="TipoEmision.jsp">Add TipoEmision</a>
</center>
</body>
</html>
