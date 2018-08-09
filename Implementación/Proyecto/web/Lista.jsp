<%-- 
    Document   : Lista
    Created on : 07-08-2018, 0:26:29
    Author     : Gabriel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>VistaLista</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>

    <body>
        <p class="text-center" style="font-size:24px;">${nombre}</p>
        <div class="container">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Serie</th>
                            <th style="background-color:#60c659;"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==1}">
                                <tr>
                                    <td><a data-toggle="modal" href="#myModal" data-eid="${entrada.getIdEntrada()}" data-ulcap="${entrada.getUltimoCapitulo()}" data-terminado="${entrada.getTerminado()}" data-aldia="${entrada.getAlDia()}" class="open-ModificarEntrada btn btn-primary">${entrada.getSerieGenericaidSerie().getNombre()}</a></td>                            
                                    <td><a href="JavaScript:confirma('EliminarEntrada?id=${entrada.getIdEntrada()}')"><strong>Eliminar</strong></a></td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Anime</th>
                            <th style="background-color:#60c659;"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==2}">
                                <tr>
                                    <td><a data-toggle="modal" href="#myModal" data-eid="${entrada.getIdEntrada()}" data-ulcap="${entrada.getUltimoCapitulo()}" data-terminado="${entrada.getTerminado()}" data-aldia="${entrada.getAlDia()}" class="open-ModificarEntrada btn btn-primary">${entrada.getAnimacionidAnimacion().getNombre()}</a></td>                            
                                    <td><a href="JavaScript:confirma('EliminarEntrada?id=${entrada.getIdEntrada()}')"><strong>Eliminar</strong></a></td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Manga</th>
                            <th style="background-color:#60c659;"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==3}">
                                <tr>
                                    <td><a data-toggle="modal" href="#myModal" data-eid="${entrada.getIdEntrada()}" data-ulcap="${entrada.getUltimoCapitulo()}" data-terminado="${entrada.getTerminado()}" data-aldia="${entrada.getAlDia()}" class="open-ModificarEntrada btn btn-primary">${entrada.getMangaidManga().getNombreManga()}</td>                           
                                    <td><a href="JavaScript:confirma('EliminarEntrada?id=${entrada.getIdEntrada()}')"><strong>Eliminar</strong></a></td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Novela Ligera</th>
                            <th style="background-color:#60c659;"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==4}">
                                <tr>
                                    <td><a data-toggle="modal" href="#myModal" data-eid="${entrada.getIdEntrada()}" data-ulcap="${entrada.getUltimoCapitulo()}" data-terminado="${entrada.getTerminado()}" data-aldia="${entrada.getAlDia()}" class="open-ModificarEntrada btn btn-primary">${entrada.getNovelaidNovela().getNombre()}</td> 
                                    <td><a href="JavaScript:confirma('EliminarEntrada?id=${entrada.getIdEntrada()}')"><strong>Eliminar</strong></a></td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modificando Entrada</h4>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="ModificarEntrada">
                            <input type="text" name="eId" id="eid" type="hidden"/>
                            <label>Ultimo Capitulo:</label><br>
                            <input type="text" name="ulCap" id="ulcap" value=""/><br>
                            <label>Terminado:</label><br>
                            <input type="checkbox" name="terminado" id="terminado"/><br>
                            <label>Al Dia:</label><br>
                            <input type="checkbox" name="alDia" id="aldia"/><br>
                            <input type="submit" value="Modificar"/>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script>
            $(document).on("click", ".open-ModificarEntrada", function () {
                var eId = $(this).data('eid');
                var ulCap = $(this).data('ulcap');
                var terminado = $(this).data('terminado');
                var alDia = $(this).data('aldia');
                $(".modal-body #eid").val(eId);
                $(".modal-body #eid").prop("type", "hidden");
                $(".modal-body #ulcap").val(ulCap);
                $(".modal-body #ulcap").prop("type", "number");
                if (terminado) {
                    document.getElementById("terminado").checked = true;
                } else {
                    document.getElementById("terminado").checked = false;
                }

                if (alDia) {
                    document.getElementById("aldia").checked = true;
                } else {
                    document.getElementById("aldia").checked = false;
                }

            });
        </script>
        <script language="JavaScript">
            function confirma(url) {
                if (confirm("¿Está seguro que desea eliminar este elemento?"))
                    location.replace(url);
            }
        </script>
    </body>

</html>