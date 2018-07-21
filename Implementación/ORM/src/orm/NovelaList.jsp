<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Novela List</title>
</head>
<body>
<center>
<h1>Novela List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdNovela(PK)</td>
		<td>Nombre</td>
		<td>NombreAlternativo</td>
		<td>Año</td>
		<td>Licenciado</td>
		<td>CompletamenteTraducido</td>
		<td>NovelUpdateUrl</td>
		<td>Estrellas</td>
		<td>EstadoUsuarioidEstadoUsuario</td>
		<td>PublicadorOriginalidPublicadorOriginal(FK)</td>
		<td>AutoridAutor(FK)</td>
		<td>PublicadorInglesidPublicadorIngles(FK)</td>
		<td>TipoidTipo(FK)</td>
		<td>LenguajeOriginalidLenguaje(FK)</td>
		<td>ArtistaidArtista(FK)</td>
		<td></td>
	</tr>
<%
ORM.Novela[] novelas = ORM.NovelaDAO.listNovelaByQuery(null, null);
for(int i = 0; i < novelas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(novelas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(novelas[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getNombreAlternativo());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getAño());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getLicenciado());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getCompletamenteTraducido());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getNovelUpdateUrl());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getEstrellas());
		out.println("</td>");
		out.print("<td>");
		out.print(novelas[i].getEstadoUsuarioidEstadoUsuario());
		out.println("</td>");
		
		ORM.PublicadorOriginal publicadorOriginalidPublicadorOriginal = novelas[i].getPublicadorOriginalidPublicadorOriginal();
		if(publicadorOriginalidPublicadorOriginal != null) {
			out.print("<td>");
			out.print("<a href=\"PublicadorOriginal.jsp?action=search&idPublicadorOriginal=");
			out.print(publicadorOriginalidPublicadorOriginal.getORMID());
			out.print("\">");
			out.print(publicadorOriginalidPublicadorOriginal.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Autor autoridAutor = novelas[i].getAutoridAutor();
		if(autoridAutor != null) {
			out.print("<td>");
			out.print("<a href=\"Autor.jsp?action=search&idAutor=");
			out.print(autoridAutor.getORMID());
			out.print("\">");
			out.print(autoridAutor.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.PublicadorIngles publicadorInglesidPublicadorIngles = novelas[i].getPublicadorInglesidPublicadorIngles();
		if(publicadorInglesidPublicadorIngles != null) {
			out.print("<td>");
			out.print("<a href=\"PublicadorIngles.jsp?action=search&idPublicadorIngles=");
			out.print(publicadorInglesidPublicadorIngles.getORMID());
			out.print("\">");
			out.print(publicadorInglesidPublicadorIngles.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Tipo tipoidTipo = novelas[i].getTipoidTipo();
		if(tipoidTipo != null) {
			out.print("<td>");
			out.print("<a href=\"Tipo.jsp?action=search&idTipo=");
			out.print(tipoidTipo.getORMID());
			out.print("\">");
			out.print(tipoidTipo.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.LenguajeOriginal lenguajeOriginalidLenguaje = novelas[i].getLenguajeOriginalidLenguaje();
		if(lenguajeOriginalidLenguaje != null) {
			out.print("<td>");
			out.print("<a href=\"LenguajeOriginal.jsp?action=search&idLenguaje=");
			out.print(lenguajeOriginalidLenguaje.getORMID());
			out.print("\">");
			out.print(lenguajeOriginalidLenguaje.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Artista artistaidArtista = novelas[i].getArtistaidArtista();
		if(artistaidArtista != null) {
			out.print("<td>");
			out.print("<a href=\"Artista.jsp?action=search&idArtista=");
			out.print(artistaidArtista.getORMID());
			out.print("\">");
			out.print(artistaidArtista.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Novela.jsp?action=search&idNovela=");
		out.print(novelas[i].getORMID());
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
<a href="Novela.jsp">Add Novela</a>
</center>
</body>
</html>
