<%-- 
    Document   : nameView
    Created on : Mar 27, 2012, 11:24:48 PM
    Author     : dbaluguri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name</title>
    </head>
    <body>
        <h1>Enter your name:</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
                Name:
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
            </form>
        </spring:nestedPath>
    </body>
</html>
