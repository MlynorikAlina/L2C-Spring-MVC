<%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 05.07.2022
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form:form action="form-processing" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:option value="Brazil" label="Brazil"/>
        <form:option value="France" label="France"/>
        <form:option value="USA" label="USA"/>
        <form:option value="Russia" label="Russia"/>
        <form:option value="Canada" label="Canada"/>
    </form:select>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
