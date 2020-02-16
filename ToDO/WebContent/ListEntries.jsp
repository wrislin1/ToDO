<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Entries</title>
</head>
<body>
<header><a href="index.jsp">Return to Menu</a></header>
<h1>Here is your To Do List!!!</h1>
<hr>
<ol>	 
<c:forEach var="entries" items="${listEntries}">
  <li><c:out value="${entries.entry}" /></li>
</c:forEach>
</ol> 
</body>
</html>