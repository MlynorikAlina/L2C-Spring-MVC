<%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 05.07.2022
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <h3>Student: ${student.lastName} ${student.firstName}</h3>
    <br>
    <h3>Country: ${student.country}</h3>
    <h3>OS: ${student.operatingSystem}</h3>
    <br>
    <h3>Programming language:</h3>
    <ul>
        <c:forEach var="language" items="${student.programingLanguages}">
            <li> ${language} </li>
        </c:forEach>
    </ul>
    <a href="/spring/">Home</a>
</body>
</html>
