<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="TagBean" scope="page" class="ORM.TagProcessor" />
<jsp:setProperty name="TagBean" property="*" />
<% String result = TagBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'TagList.jsp';
		return true;
	}
// -->
</script>
<head><title>Tag</title>
</head>
<body>
<h1>Tag</h1>
<form method="POST" name="form1" action=Tag.jsp>
	<table>
		<tr>
			<td>*IdTag : </td>
			<td><input type=text name="idTag" value="<jsp:getProperty name="TagBean" property="idTag"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="TagBean" property="nombre"/>" /></td>
		</tr>
		<tr>
			<td>Descripcion : </td>
			<td><input type=text name="descripcion" value="<jsp:getProperty name="TagBean" property="descripcion"/>" /></td>
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
