<%-- 
    Document   : topics
    Created on : 02/11/2020, 16:42:12
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CourseraWEB | Topics</title>
        <style>
            *{
                box-sizing:border-box;
                margin:0;
                padding:0
            }

            html, body{
                width: 100%;
                height:100%;
                font-family: 'Segoe UI', Helvetica Neue, Helvetica, Lucida Grande, Arial;
            }
            body {
                background:url(https://s2.best-wallpaper.net/wallpaper/3840x2160/1801/England-Wales-waterfall-river-trees_3840x2160.jpg);
                background-size: auto;
                background-repeat: no-repeat;
                background-position: center;
            }
            .app-window {

                margin: 20px;
                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }
            .title-container{

                margin: 2%;
                height: 20%;
                width: 100%;

                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }

            .line {
                background: #fff;
                height: 2px;
                width: 60px;
                margin-top: 2%; 
                margin-bottom: 2%;
            }

            span, h2 {
                -webkit-flex: 1 0 auto;
                flex: 1 0 auto;
            }

            h2 {
                color: #fff;
                text-align: center;
                overflow: auto;
                font-size: 100%;
                min-width: 100%;
            }    
            @media(min-width: 450px) {
                h2 {
                    font-size: 130%;
                }
            }

            .sidebar {

                background-color: rgba(0,0,0,0.2);
                border-radius: 10px;
                height: 100%;
                width: 100%;
                padding: 20px;


                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }
        </style>
    </head>
    <body>
        <div class="app-window">
            <div class="title-container">
                <span class='line'></span>
                <h2>Coursera WEB</h2>
                <span class='line'></span>
            </div>
            <div class="sidebar">
                OLAAA
            </div>
        </div>
    </body>
</html>
