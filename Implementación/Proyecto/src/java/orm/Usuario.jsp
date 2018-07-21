<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="UsuarioBean" scope="page" class="ORM.UsuarioProcessor" />
<jsp:setProperty name="UsuarioBean" property="*" />
<% String result = UsuarioBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'UsuarioList.jsp';
		return true;
	}
// -->
</script>
<head><title>Usuario</title>
</head>
<body>
<h1>Usuario</h1>
<form method="POST" name="form1" action=Usuario.jsp>
	<table>
		<tr>
			<td>*IdUsuario : </td>
			<td><input type=text name="idUsuario" value="<jsp:getProperty name="UsuarioBean" property="idUsuario"/>" /></td>
		</tr>
		<tr>
			<td>NombreUsuario : </td>
			<td><input type=text name="nombreUsuario" value="<jsp:getProperty name="UsuarioBean" property="nombreUsuario"/>" /></td>
		</tr>
		<tr>
			<td>ContraseñaUsuario : </td>
			<td><input type=text name="contraseñaUsuario" value="<jsp:getProperty name="UsuarioBean" property="contraseñaUsuario"/>" /></td>
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
