<%-- 
    Document   : resultado
    Created on : 04-ago-2015, 11:13:32
    Author     : Soler
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Date d= new Date(); %>
        
        <h1>Bienvenido!, <%= request.getParameter("userName") %>, (<%= request.getParameter("user") %>)</h1>
        <br>
        Fecha de ingreso: <%=d %>
        
    </body>
</html>
