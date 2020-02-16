<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>To Do List</title>
</head>
<body>
<h1>Welcome to the To Do List</h1>
<hr>
<p>Please choose an option</p>
<a href="AddEntries.jsp" class="button">Add an Entry</a>
<form action="EntryController" method="post">
<button id="rlist" type=submit value="R">Remove Entries</button>
</form>
<form action="EntryController" method="get">
<button id="elist" type=submit value="List Entries">List Entries</button>
</form>
</body>
</html>