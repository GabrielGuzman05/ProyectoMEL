<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="ArtistaBean" scope="page" class="ORM.ArtistaProcessor" />
<jsp:setProperty name="ArtistaBean" property="*" />
<% String result = ArtistaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ArtistaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Artista</title>
</head>
<body>
<h1>Artista</h1>
<form method="POST" name="form1" action=Artista.jsp>
	<table>
		<tr>
			<td>*IdArtista : </td>
			<td><input type=text name="idArtista" value="<jsp:getProperty name="ArtistaBean" property="idArtista"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="ArtistaBean" property="nombre"/>" /></td>
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
