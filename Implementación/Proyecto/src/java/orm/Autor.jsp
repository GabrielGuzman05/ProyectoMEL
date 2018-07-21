<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="AutorBean" scope="page" class="ORM.AutorProcessor" />
<jsp:setProperty name="AutorBean" property="*" />
<% String result = AutorBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'AutorList.jsp';
		return true;
	}
// -->
</script>
<head><title>Autor</title>
</head>
<body>
<h1>Autor</h1>
<form method="POST" name="form1" action=Autor.jsp>
	<table>
		<tr>
			<td>*IdAutor : </td>
			<td><input type=text name="idAutor" value="<jsp:getProperty name="AutorBean" property="idAutor"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="AutorBean" property="nombre"/>" /></td>
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
