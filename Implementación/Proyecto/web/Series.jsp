<%-- 
    Document   : Series
    Created on : 01-08-2018, 2:44:31
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <style type="text/css">

            /* alf links */
            .alf {
                margin: auto;
                width: 70%;
                padding: 5px;
            }
            .alf a {
                color: black;
                float: left;
                padding: 8px 12px;
                text-decoration: none;
                transition: background-color .3s;
            }

            /* Style the active/current link */
            .alf a.active {
                background-color: dodgerblue;
                color: white;
            }

            /* Add a grey background color on mouse-over */
            .alf a:hover:not(.active) {background-color: #ddd;}

            .topnav {
                overflow: hidden;
                padding: 5px;
                border: 3px solid green;
                width: 60%;
                margin: auto;
                align-self: center;
            }

            /* Style the search box inside the navigation bar */
            .topnav input[type=text] {
                float: start;
                padding: 6px;
                font-size: 12px;
                text-align: left;
                
            }

            table, th, td {
                border: 1px solid black;
                text-align: center;
            }
            input {
                width: 100%;
            }

        </style>


    </head>
    <body>
        <div class="alf">
            <a href="#">#</a>
            <a href="#">A</a>
            <a href="#">B</a>
            <a href="#">C</a>
            <a href="#">D</a>
            <a href="#">E</a>
            <a href="#">F</a>
            <a href="#">G</a>
            <a href="#">H</a>
            <a href="#">I</a>
            <a href="#">J</a>
            <a href="#">K</a>
            <a href="#">L</a>
            <a href="#">M</a>
            <a href="#">N</a>
            <a href="#">O</a>
            <a href="#">P</a>
            <a href="#">Q</a>
            <a href="#">R</a>
            <a href="#">S</a>
            <a href="#">T</a>
            <a href="#">U</a>
            <a href="#">V</a>
            <a href="#">W</a>
            <a href="#">X</a>
            <a href="#">Y</a>
            <a href="#">Z</a>
        </div>  
        <br>
        <br>
        <br>
        <div class="topnav">
            <input type="text" placeholder="Buscar..">
        </div> 

        <br>
        <br>
        <div>
            <h1 style="text-align: center">Series</h1>
        </div><br>
        <br>
        <table style="width:100%">
            <tr>
                <th>Thumbnail</th>
                <th>Nombre de la serie</th> 
                <th>Episodios</th> 
            </tr>
            <c:forEach var="serie" items="${series}" >
                <tr>
                    <td><img class="float-none" src="images/250px-Game_of_Thrones_title_card.jpg" ></td>
                    <td><a href="SerieTemplate.html">${serie.nombre}</td>
                    <td>${serie.episodios}</td>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>