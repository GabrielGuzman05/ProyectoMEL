<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="NovelaBean" scope="page" class="ORM.NovelaProcessor" />
<jsp:setProperty name="NovelaBean" property="*" />
<% String result = NovelaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'NovelaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Novela</title>
</head>
<body>
<h1>Novela</h1>
<form method="POST" name="form1" action=Novela.jsp>
	<table>
		<tr>
			<td>*IdNovela : </td>
			<td><input type=text name="idNovela" value="<jsp:getProperty name="NovelaBean" property="idNovela"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="NovelaBean" property="nombre"/>" /></td>
		</tr>
		<tr>
			<td>NombreAlternativo : </td>
			<td><input type=text name="nombreAlternativo" value="<jsp:getProperty name="NovelaBean" property="nombreAlternativo"/>" /></td>
		</tr>
		<tr>
			<td>Año : </td>
			<td><input type=text name="año" value="<jsp:getProperty name="NovelaBean" property="año"/>" /></td>
		</tr>
		<tr>
			<td>Licenciado : </td>
			<td><input type=text name="licenciado" value="<jsp:getProperty name="NovelaBean" property="licenciado"/>" /></td>
		</tr>
		<tr>
			<td>CompletamenteTraducido : </td>
			<td><input type=text name="completamenteTraducido" value="<jsp:getProperty name="NovelaBean" property="completamenteTraducido"/>" /></td>
		</tr>
		<tr>
			<td>NovelUpdateUrl : </td>
			<td><input type=text name="novelUpdateUrl" value="<jsp:getProperty name="NovelaBean" property="novelUpdateUrl"/>" /></td>
		</tr>
		<tr>
			<td>Estrellas : </td>
			<td><input type=text name="estrellas" value="<jsp:getProperty name="NovelaBean" property="estrellas"/>" /></td>
		</tr>
		<tr>
			<td>EstadoUsuarioidEstadoUsuario : </td>
			<td><input type=text name="estadoUsuarioidEstadoUsuario" value="<jsp:getProperty name="NovelaBean" property="estadoUsuarioidEstadoUsuario"/>" /></td>
		</tr>
		<tr>
			<td>PublicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal : </td>
			<td><input type=text name="publicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal" value="<jsp:getProperty name="NovelaBean" property="publicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal"/>" /></td>
		</tr>
		<tr>
			<td>AutoridAutor_autoridAutor : </td>
			<td><input type=text name="autoridAutor_autoridAutor" value="<jsp:getProperty name="NovelaBean" property="autoridAutor_autoridAutor"/>" /></td>
		</tr>
		<tr>
			<td>PublicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles : </td>
			<td><input type=text name="publicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles" value="<jsp:getProperty name="NovelaBean" property="publicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles"/>" /></td>
		</tr>
		<tr>
			<td>TipoidTipo_tipoidTipo : </td>
			<td><input type=text name="tipoidTipo_tipoidTipo" value="<jsp:getProperty name="NovelaBean" property="tipoidTipo_tipoidTipo"/>" /></td>
		</tr>
		<tr>
			<td>LenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje : </td>
			<td><input type=text name="lenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje" value="<jsp:getProperty name="NovelaBean" property="lenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje"/>" /></td>
		</tr>
		<tr>
			<td>ArtistaidArtista_artistaidArtista : </td>
			<td><input type=text name="artistaidArtista_artistaidArtista" value="<jsp:getProperty name="NovelaBean" property="artistaidArtista_artistaidArtista"/>" /></td>
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
