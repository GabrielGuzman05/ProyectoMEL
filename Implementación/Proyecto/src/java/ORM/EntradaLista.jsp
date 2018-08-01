<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="EntradaListaBean" scope="page" class="ORM.EntradaListaProcessor" />
<jsp:setProperty name="EntradaListaBean" property="*" />
<% String result = EntradaListaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'EntradaListaList.jsp';
		return true;
	}
// -->
</script>
<head><title>EntradaLista</title>
</head>
<body>
<h1>EntradaLista</h1>
<form method="POST" name="form1" action=EntradaLista.jsp>
	<table>
		<tr>
			<td>*IdEntrada : </td>
			<td><input type=text name="idEntrada" value="<jsp:getProperty name="EntradaListaBean" property="idEntrada"/>" /></td>
		</tr>
		<tr>
			<td>AlDia : </td>
			<td><input type=text name="alDia" value="<jsp:getProperty name="EntradaListaBean" property="alDia"/>" /></td>
		</tr>
		<tr>
			<td>UltimoCapitulo : </td>
			<td><input type=text name="ultimoCapitulo" value="<jsp:getProperty name="EntradaListaBean" property="ultimoCapitulo"/>" /></td>
		</tr>
		<tr>
			<td>Terminado : </td>
			<td><input type=text name="terminado" value="<jsp:getProperty name="EntradaListaBean" property="terminado"/>" /></td>
		</tr>
		<tr>
			<td>Tipo : </td>
			<td><input type=text name="tipo" value="<jsp:getProperty name="EntradaListaBean" property="tipo"/>" /></td>
		</tr>
		<tr>
			<td>ListaidLista_listaidLista : </td>
			<td><input type=text name="listaidLista_listaidLista" value="<jsp:getProperty name="EntradaListaBean" property="listaidLista_listaidLista"/>" /></td>
		</tr>
		<tr>
			<td>NovelaidNovela_novelaidNovela : </td>
			<td><input type=text name="novelaidNovela_novelaidNovela" value="<jsp:getProperty name="EntradaListaBean" property="novelaidNovela_novelaidNovela"/>" /></td>
		</tr>
		<tr>
			<td>MangaidManga_mangaidManga : </td>
			<td><input type=text name="mangaidManga_mangaidManga" value="<jsp:getProperty name="EntradaListaBean" property="mangaidManga_mangaidManga"/>" /></td>
		</tr>
		<tr>
			<td>AnimacionidAnimacion_animacionidAnimacion : </td>
			<td><input type=text name="animacionidAnimacion_animacionidAnimacion" value="<jsp:getProperty name="EntradaListaBean" property="animacionidAnimacion_animacionidAnimacion"/>" /></td>
		</tr>
		<tr>
			<td>SerieGenericaidSerie_serieGenericaidSerie : </td>
			<td><input type=text name="serieGenericaidSerie_serieGenericaidSerie" value="<jsp:getProperty name="EntradaListaBean" property="serieGenericaidSerie_serieGenericaidSerie"/>" /></td>
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
