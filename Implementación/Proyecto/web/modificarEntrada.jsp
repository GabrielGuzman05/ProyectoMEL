<%-- 
    Document   : modificarEntrada
    Created on : 06-08-2018, 22:32:58
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <form>
        ¿Está al día?<br>
        <input type="radio" name="alDia" value="Si" checked> Si
        <input type="radio" name="alDia" value="No" checked> No<br>

        Último Episodio:<br>
        <input type="text" name="episodio" ><br>

        ¿Terminado?<br>
        <input type="radio" name="terminado" value="Si" checked> Si
        <input type="radio" name="terminado" value="No" checked> No<br>

        <input type="submit" value="Guardar">
        <input type="submit" value="Cancelar">
    </form>

</body>
</html>
