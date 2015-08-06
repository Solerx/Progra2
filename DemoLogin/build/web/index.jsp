<%-- 
    Document   : index
    Created on : 04-ago-2015, 10:48:06
    Author     : Soler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <Style>
            body{background: cadetblue}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso al Sistema</h1>
        
        <form action="Login">
            
            Usuario: <input type="text" name="user"/><br/>
        
            Contraseña: <input type="password" name="password"/><br/>
            
             <input type="submit" name="send" value="Ingresar"/><br/>
             
        </form>
        
    </body>
</html>
