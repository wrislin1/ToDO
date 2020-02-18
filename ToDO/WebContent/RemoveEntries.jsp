<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Remove Entry</title>
</head>
<body>
<header><a href="index.jsp">Return to Menu</a></header>
<h1>Select Entries to remove</h1>
<hr>
<form action="EntryController" method ="post">	 
  <c:forEach var="entries" items="${listEntries}">
  <label><input type="checkbox" id="entries" name="entries" value ="${entries.id }"><span><c:out value="${entries.entry}" /></span></label>
 </c:forEach>
 <input type="submit" value="Submit">
</form> 
</body>
</html>