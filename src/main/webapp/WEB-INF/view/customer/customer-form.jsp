<%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 06.07.2022
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form</title>
    <style>
        .errors{
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="form-processing" modelAttribute="customer">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name(*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="errors"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
