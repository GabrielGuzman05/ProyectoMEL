<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="ListaBean" scope="page" class="ORM.ListaProcessor" />
<jsp:setProperty name="ListaBean" property="*" />
<% String result = ListaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ListaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Lista</title>
</head>
<body>
<h1>Lista</h1>
<form method="POST" name="form1" action=Lista.jsp>
	<table>
		<tr>
			<td>*IdLista : </td>
			<td><input type=text name="idLista" value="<jsp:getProperty name="ListaBean" property="idLista"/>" /></td>
		</tr>
		<tr>
			<td>NombreLista : </td>
			<td><input type=text name="nombreLista" value="<jsp:getProperty name="ListaBean" property="nombreLista"/>" /></td>
		</tr>
		<tr>
			<td>UsuarioidUsuario_usuarioidUsuario : </td>
			<td><input type=text name="usuarioidUsuario_usuarioidUsuario" value="<jsp:getProperty name="ListaBean" property="usuarioidUsuario_usuarioidUsuario"/>" /></td>
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
