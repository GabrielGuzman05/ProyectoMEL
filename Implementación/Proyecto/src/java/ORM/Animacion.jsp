<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="AnimacionBean" scope="page" class="ORM.AnimacionProcessor" />
<jsp:setProperty name="AnimacionBean" property="*" />
<% String result = AnimacionBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'AnimacionList.jsp';
		return true;
	}
// -->
</script>
<head><title>Animacion</title>
</head>
<body>
<h1>Animacion</h1>
<form method="POST" name="form1" action=Animacion.jsp>
	<table>
		<tr>
			<td>*IdAnimacion : </td>
			<td><input type=text name="idAnimacion" value="<jsp:getProperty name="AnimacionBean" property="idAnimacion"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="AnimacionBean" property="nombre"/>" /></td>
		</tr>
		<tr>
			<td>NombreAlternativo : </td>
			<td><input type=text name="nombreAlternativo" value="<jsp:getProperty name="AnimacionBean" property="nombreAlternativo"/>" /></td>
		</tr>
		<tr>
			<td>Fuente : </td>
			<td><input type=text name="fuente" value="<jsp:getProperty name="AnimacionBean" property="fuente"/>" /></td>
		</tr>
		<tr>
			<td>EnEmision : </td>
			<td><input type=text name="enEmision" value="<jsp:getProperty name="AnimacionBean" property="enEmision"/>" /></td>
		</tr>
		<tr>
			<td>Episodios : </td>
			<td><input type=text name="episodios" value="<jsp:getProperty name="AnimacionBean" property="episodios"/>" /></td>
		</tr>
		<tr>
			<td>MALCode : </td>
			<td><input type=text name="MALCode" value="<jsp:getProperty name="AnimacionBean" property="MALCode"/>" /></td>
		</tr>
		<tr>
			<td>EstadoUsuarioidEstadoUsuario : </td>
			<td><input type=text name="estadoUsuarioidEstadoUsuario" value="<jsp:getProperty name="AnimacionBean" property="estadoUsuarioidEstadoUsuario"/>" /></td>
		</tr>
		<tr>
			<td>TemporadaidTemporada_temporadaidTemporada : </td>
			<td><input type=text name="temporadaidTemporada_temporadaidTemporada" value="<jsp:getProperty name="AnimacionBean" property="temporadaidTemporada_temporadaidTemporada"/>" /></td>
		</tr>
		<tr>
			<td>TipoEmisionidTipoEmision_tipoEmisionidTipoEmision : </td>
			<td><input type=text name="tipoEmisionidTipoEmision_tipoEmisionidTipoEmision" value="<jsp:getProperty name="AnimacionBean" property="tipoEmisionidTipoEmision_tipoEmisionidTipoEmision"/>" /></td>
		</tr>
		<tr>
			<td>RatingidRating_ratingidRating : </td>
			<td><input type=text name="ratingidRating_ratingidRating" value="<jsp:getProperty name="AnimacionBean" property="ratingidRating_ratingidRating"/>" /></td>
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
