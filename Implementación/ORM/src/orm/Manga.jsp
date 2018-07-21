<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="MangaBean" scope="page" class="ORM.MangaProcessor" />
<jsp:setProperty name="MangaBean" property="*" />
<% String result = MangaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'MangaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Manga</title>
</head>
<body>
<h1>Manga</h1>
<form method="POST" name="form1" action=Manga.jsp>
	<table>
		<tr>
			<td>*IdManga : </td>
			<td><input type=text name="idManga" value="<jsp:getProperty name="MangaBean" property="idManga"/>" /></td>
		</tr>
		<tr>
			<td>EstadoUsuarioidEstadoUsuario : </td>
			<td><input type=text name="estadoUsuarioidEstadoUsuario" value="<jsp:getProperty name="MangaBean" property="estadoUsuarioidEstadoUsuario"/>" /></td>
		</tr>
		<tr>
			<td>NombreManga : </td>
			<td><input type=text name="nombreManga" value="<jsp:getProperty name="MangaBean" property="nombreManga"/>" /></td>
		</tr>
		<tr>
			<td>NombreAlternativo : </td>
			<td><input type=text name="nombreAlternativo" value="<jsp:getProperty name="MangaBean" property="nombreAlternativo"/>" /></td>
		</tr>
		<tr>
			<td>CompletamenteScanlated : </td>
			<td><input type=text name="completamenteScanlated" value="<jsp:getProperty name="MangaBean" property="completamenteScanlated"/>" /></td>
		</tr>
		<tr>
			<td>TieneAnimacion : </td>
			<td><input type=text name="tieneAnimacion" value="<jsp:getProperty name="MangaBean" property="tieneAnimacion"/>" /></td>
		</tr>
		<tr>
			<td>Año : </td>
			<td><input type=text name="año" value="<jsp:getProperty name="MangaBean" property="año"/>" /></td>
		</tr>
		<tr>
			<td>Licenciado : </td>
			<td><input type=text name="licenciado" value="<jsp:getProperty name="MangaBean" property="licenciado"/>" /></td>
		</tr>
		<tr>
			<td>BakaUpdatesCode : </td>
			<td><input type=text name="bakaUpdatesCode" value="<jsp:getProperty name="MangaBean" property="bakaUpdatesCode"/>" /></td>
		</tr>
		<tr>
			<td>EstadoEnPaisDeOrigen : </td>
			<td><input type=text name="estadoEnPaisDeOrigen" value="<jsp:getProperty name="MangaBean" property="estadoEnPaisDeOrigen"/>" /></td>
		</tr>
		<tr>
			<td>AnimeStartEnd : </td>
			<td><input type=text name="animeStartEnd" value="<jsp:getProperty name="MangaBean" property="animeStartEnd"/>" /></td>
		</tr>
		<tr>
			<td>TipoMangaidTipoManga_tipoMangaidTipoManga : </td>
			<td><input type=text name="tipoMangaidTipoManga_tipoMangaidTipoManga" value="<jsp:getProperty name="MangaBean" property="tipoMangaidTipoManga_tipoMangaidTipoManga"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
