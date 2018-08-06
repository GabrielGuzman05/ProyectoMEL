<%-- 
    Document   : NovelaTemplate
    Created on : 05-08-2018, 23:58:35
    Author     : Pablo
--%>
<h1 class="text-center">${novela.nombre}</h1>
    <p>${novela.nombreAlternativo}</p>
    <p>${novela.año}</p>
    <p>Episodios</p>
    <div class="row" style="padding:30px;">
        <div class="col offset-lg-1">
            <div><img class="float-none" src="assets/img/WW1.png" width="300"> <-- esto no va aqui</div>
        </div>
        <div class="col">
            <div></div>
            <p><a href="ControladorListas?id=${novela.idNovela}">Agregar a una lista existente</p>
            <p><a href="">Crear lista</p>
            
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    
</body>


</html>