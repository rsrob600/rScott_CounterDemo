<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Current visit count</title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>

	<p>You have visited <a href="/">http://your_server  </a><c:out value="${count}"/>  times.</p>
	
	<p><a href="/">Test another visit?</a></p>


</body>
</html>