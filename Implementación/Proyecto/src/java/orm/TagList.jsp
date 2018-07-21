<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Tag List</title>
</head>
<body>
<center>
<h1>Tag List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdTag(PK)</td>
		<td>Nombre</td>
		<td>Descripcion</td>
		<td></td>
	</tr>
<%
ORM.Tag[] tags = ORM.TagDAO.listTagByQuery(null, null);
for(int i = 0; i < tags.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(tags[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(tags[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(tags[i].getDescripcion());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Tag.jsp?action=search&idTag=");
		out.print(tags[i].getORMID());
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
<a href="Tag.jsp">Add Tag</a>
</center>
</body>
</html>
