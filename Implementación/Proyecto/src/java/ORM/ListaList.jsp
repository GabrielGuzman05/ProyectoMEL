<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Lista List</title>
</head>
<body>
<center>
<h1>Lista List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdLista(PK)</td>
		<td>NombreLista</td>
		<td>UsuarioidUsuario(FK)</td>
		<td></td>
	</tr>
<%
ORM.Lista[] listas = ORM.ListaDAO.listListaByQuery(null, null);
for(int i = 0; i < listas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(listas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(listas[i].getNombreLista());
		out.println("</td>");
		
		ORM.Usuario usuarioidUsuario = listas[i].getUsuarioidUsuario();
		if(usuarioidUsuario != null) {
			out.print("<td>");
			out.print("<a href=\"Usuario.jsp?action=search&idUsuario=");
			out.print(usuarioidUsuario.getORMID());
			out.print("\">");
			out.print(usuarioidUsuario.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Lista.jsp?action=search&idLista=");
		out.print(listas[i].getORMID());
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
<a href="Lista.jsp">Add Lista</a>
</center>
</body>
</html>
