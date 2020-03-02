<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Add Entry</title>
</head>
<body>
<header><a href="index.jsp">Return to Menu</a></header>
	<hr>

	<form action="EntryController" method="post" id ="addform">
	
<input id="addtext" required type="text" name="choice" placeholder="What do you plan on doing?">
		<div class="addbuttons" id ="b1">
		<input class="b" type="submit" value="Submit">
		</div>
	</form>
	<form action="EntryController" method="get">
<input id ="list" id ="addbutton" name="choice" value="list"/>
<div class="addbuttons">
<button class="b" type=submit>View To Do List</button>
</div>
</form>
</body>
</html>