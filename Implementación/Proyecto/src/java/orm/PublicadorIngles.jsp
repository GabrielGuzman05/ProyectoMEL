<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="PublicadorInglesBean" scope="page" class="ORM.PublicadorInglesProcessor" />
<jsp:setProperty name="PublicadorInglesBean" property="*" />
<% String result = PublicadorInglesBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PublicadorInglesList.jsp';
		return true;
	}
// -->
</script>
<head><title>PublicadorIngles</title>
</head>
<body>
<h1>PublicadorIngles</h1>
<form method="POST" name="form1" action=PublicadorIngles.jsp>
	<table>
		<tr>
			<td>*IdPublicadorIngles : </td>
			<td><input type=text name="idPublicadorIngles" value="<jsp:getProperty name="PublicadorInglesBean" property="idPublicadorIngles"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="PublicadorInglesBean" property="nombre"/>" /></td>
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
