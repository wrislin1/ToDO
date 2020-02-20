<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>List Entries</title>
</head>
<body>
<header><a href="index.jsp">Return to Menu</a></header>
<h1>Here is Your To Do List!!!</h1>
<hr>
<ol>	 
<c:forEach var="entries" items="${listEntries}" varStatus="loopStatus">
  <li class="${loopStatus.index % 2 == 0 ? 'odd' : 'even'}"><a title="${entries.getDate()}"><c:out value="${entries.entry}" /></a></li>
</c:forEach>
</ol> 
<div>
<form action="EntryController" method="post">
<input id ="add" name="choice" value="add"/>
<div class="listbuttons">
<button type=submit>Add Entries</button>
</div>
</form>
<form action="EntryController" method="post">
<input id ="remove" name="choice" value="remove"/>
<div class="listbuttons">
<button type=submit>Remove Entries</button>
</div>
</form>
</div>
</body>
</html>