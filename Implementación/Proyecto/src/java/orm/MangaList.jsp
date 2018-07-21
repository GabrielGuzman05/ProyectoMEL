<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Manga List</title>
</head>
<body>
<center>
<h1>Manga List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdManga(PK)</td>
		<td>EstadoUsuarioidEstadoUsuario</td>
		<td>NombreManga</td>
		<td>NombreAlternativo</td>
		<td>CompletamenteScanlated</td>
		<td>TieneAnimacion</td>
		<td>Año</td>
		<td>Licenciado</td>
		<td>BakaUpdatesCode</td>
		<td>EstadoEnPaisDeOrigen</td>
		<td>AnimeStartEnd</td>
		<td>TipoMangaidTipoManga(FK)</td>
		<td></td>
	</tr>
<%
ORM.Manga[] mangas = ORM.MangaDAO.listMangaByQuery(null, null);
for(int i = 0; i < mangas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(mangas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(mangas[i].getEstadoUsuarioidEstadoUsuario());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getNombreManga());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getNombreAlternativo());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getCompletamenteScanlated());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getTieneAnimacion());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getAño());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getLicenciado());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getBakaUpdatesCode());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getEstadoEnPaisDeOrigen());
		out.println("</td>");
		out.print("<td>");
		out.print(mangas[i].getAnimeStartEnd());
		out.println("</td>");
		
		ORM.TipoManga tipoMangaidTipoManga = mangas[i].getTipoMangaidTipoManga();
		if(tipoMangaidTipoManga != null) {
			out.print("<td>");
			out.print("<a href=\"TipoManga.jsp?action=search&idTipoManga=");
			out.print(tipoMangaidTipoManga.getORMID());
			out.print("\">");
			out.print(tipoMangaidTipoManga.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Manga.jsp?action=search&idManga=");
		out.print(mangas[i].getORMID());
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
<a href="Manga.jsp">Add Manga</a>
</center>
</body>
</html>
