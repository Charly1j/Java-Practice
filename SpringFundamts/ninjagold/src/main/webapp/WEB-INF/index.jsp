<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Gold: <%= request.getAttribute("gold") %></h1>

    <form action="farm" method="post">
        <fieldset>
            <legend>Farm</legend>
            <p>Sume entre 10 y 20 de oro.</p>
            <button type="submit">Find Gold!</button>
        </fieldset>
    </form>

    <form action="cave" method="post">
        <fieldset>
            <legend>Cave</legend>
            <p>Sume entre 5 y 10 de oro.</p>
            <button type="submit">Find Gold!</button>
        </fieldset>
    </form>

    <form action="house" method="post">
        <fieldset>
            <legend>House</legend>
            <p>Sume entre 2 y 5 de oro.</p>
            <button type="submit">Find Gold!</button>
        </fieldset>
    </form>

    <form action="casino" method="post">
        <fieldset>
            <legend>Casino</legend>
            <p>Sume o reste entre 0 y 50 de oro.</p>
            <button type="submit">Find Gold!</button>
        </fieldset>
    </form>

    <div>
        <h2>Eventos:</h2>
        <ul>		
            <c:out value="${requestScope.events}"/>
                <li>${event}</li>

        </ul>
	</div>

</body>
</html>