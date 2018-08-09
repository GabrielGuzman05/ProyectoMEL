<%-- 
    Document   : NovelaTemplate
    Created on : 05-08-2018, 23:58:35
    Author     : Pablo
--%>
<h1 class="text-center">${novela.nombre}</h1>
<p>Nombre Alternativo: ${novela.nombreAlternativo}</p>
<p>Año: ${novela.año}</p>
<p>Tipo: ${novela.getTipoidTipo().getNombre()}</p>
<div class="row" style="padding:30px;">
    <div class="col offset-lg-1">
        <div><img class="float-none" src="images/novelas/${novela.idNovela}.jpg"></div>
    </div>
    <div class="col">
        <div></div>
        <c:if test="${sessionScope.loged}">
            <p><a href="ControladorListas?id=${novela.idNovela}">Agregar a una lista existente</p>
            <p><a href="">Crear lista</p>
        </c:if>

    </div>
</div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>

</body>


</html>