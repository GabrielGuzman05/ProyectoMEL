<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Animacion List</title>
</head>
<body>
<center>
<h1>Animacion List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdAnimacion(PK)</td>
		<td>Nombre</td>
		<td>NombreAlternativo</td>
		<td>Fuente</td>
		<td>EnEmision</td>
		<td>Episodios</td>
		<td>MALCode</td>
		<td>EstadoUsuarioidEstadoUsuario</td>
		<td>TemporadaidTemporada(FK)</td>
		<td>TipoEmisionidTipoEmision(FK)</td>
		<td>RatingidRating(FK)</td>
		<td></td>
	</tr>
<%
ORM.Animacion[] animacions = ORM.AnimacionDAO.listAnimacionByQuery(null, null);
for(int i = 0; i < animacions.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(animacions[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(animacions[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getNombreAlternativo());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getFuente());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getEnEmision());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getEpisodios());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getMALCode());
		out.println("</td>");
		out.print("<td>");
		out.print(animacions[i].getEstadoUsuarioidEstadoUsuario());
		out.println("</td>");
		
		ORM.Temporada temporadaidTemporada = animacions[i].getTemporadaidTemporada();
		if(temporadaidTemporada != null) {
			out.print("<td>");
			out.print("<a href=\"Temporada.jsp?action=search&idTemporada=");
			out.print(temporadaidTemporada.getORMID());
			out.print("\">");
			out.print(temporadaidTemporada.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.TipoEmision tipoEmisionidTipoEmision = animacions[i].getTipoEmisionidTipoEmision();
		if(tipoEmisionidTipoEmision != null) {
			out.print("<td>");
			out.print("<a href=\"TipoEmision.jsp?action=search&idTipoEmision=");
			out.print(tipoEmisionidTipoEmision.getORMID());
			out.print("\">");
			out.print(tipoEmisionidTipoEmision.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Rating ratingidRating = animacions[i].getRatingidRating();
		if(ratingidRating != null) {
			out.print("<td>");
			out.print("<a href=\"Rating.jsp?action=search&idRating=");
			out.print(ratingidRating.getORMID());
			out.print("\">");
			out.print(ratingidRating.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Animacion.jsp?action=search&idAnimacion=");
		out.print(animacions[i].getORMID());
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
<a href="Animacion.jsp">Add Animacion</a>
</center>
</body>
</html>
