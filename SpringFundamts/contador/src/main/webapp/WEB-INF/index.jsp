<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visitas</title>
</head>
<body>
	<h1>Bienvenido a la página principal</h1>
    <p>¡Visita la <a href="<%= request.getContextPath() %>/counter">página de contador</a> para ver cuántas veces has estado aquí!</p>
</body>
</html>