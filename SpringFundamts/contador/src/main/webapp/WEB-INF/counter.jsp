
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contador de Visitas</title>
</head>
<body>
	<h1>Contador de Visitas</h1>
    <p>Has visitado esta página ${visitCount} veces.</p></body>
    <a href="<%= request.getContextPath() %>/">Volver.</a>
</html>