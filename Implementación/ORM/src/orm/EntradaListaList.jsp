<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>EntradaLista List</title>
</head>
<body>
<center>
<h1>EntradaLista List</h1>
<table border="1" width="80%">
	<tr>
		<td>IdEntrada(PK)</td>
		<td>AlDia</td>
		<td>UltimoCapitulo</td>
		<td>Terminado</td>
		<td>Tipo</td>
		<td>ListaidLista(FK)</td>
		<td>NovelaidNovela(FK)</td>
		<td>MangaidManga(FK)</td>
		<td>AnimacionidAnimacion(FK)</td>
		<td>SerieGenericaidSerie(FK)</td>
		<td></td>
	</tr>
<%
ORM.EntradaLista[] entradaListas = ORM.EntradaListaDAO.listEntradaListaByQuery(null, null);
for(int i = 0; i < entradaListas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(entradaListas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(entradaListas[i].getAlDia());
		out.println("</td>");
		out.print("<td>");
		out.print(entradaListas[i].getUltimoCapitulo());
		out.println("</td>");
		out.print("<td>");
		out.print(entradaListas[i].getTerminado());
		out.println("</td>");
		out.print("<td>");
		out.print(entradaListas[i].getTipo());
		out.println("</td>");
		
		ORM.Lista listaidLista = entradaListas[i].getListaidLista();
		if(listaidLista != null) {
			out.print("<td>");
			out.print("<a href=\"Lista.jsp?action=search&idLista=");
			out.print(listaidLista.getORMID());
			out.print("\">");
			out.print(listaidLista.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Novela novelaidNovela = entradaListas[i].getNovelaidNovela();
		if(novelaidNovela != null) {
			out.print("<td>");
			out.print("<a href=\"Novela.jsp?action=search&idNovela=");
			out.print(novelaidNovela.getORMID());
			out.print("\">");
			out.print(novelaidNovela.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Manga mangaidManga = entradaListas[i].getMangaidManga();
		if(mangaidManga != null) {
			out.print("<td>");
			out.print("<a href=\"Manga.jsp?action=search&idManga=");
			out.print(mangaidManga.getORMID());
			out.print("\">");
			out.print(mangaidManga.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.Animacion animacionidAnimacion = entradaListas[i].getAnimacionidAnimacion();
		if(animacionidAnimacion != null) {
			out.print("<td>");
			out.print("<a href=\"Animacion.jsp?action=search&idAnimacion=");
			out.print(animacionidAnimacion.getORMID());
			out.print("\">");
			out.print(animacionidAnimacion.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		ORM.SerieGenerica serieGenericaidSerie = entradaListas[i].getSerieGenericaidSerie();
		if(serieGenericaidSerie != null) {
			out.print("<td>");
			out.print("<a href=\"SerieGenerica.jsp?action=search&idSerie=");
			out.print(serieGenericaidSerie.getORMID());
			out.print("\">");
			out.print(serieGenericaidSerie.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"EntradaLista.jsp?action=search&idEntrada=");
		out.print(entradaListas[i].getORMID());
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
<a href="EntradaLista.jsp">Add EntradaLista</a>
</center>
</body>
</html>
