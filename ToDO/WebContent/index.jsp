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
<div id ="div1">
<form action="EntryController" method="get">
<input id ="add" name="choice" value="add"/>
<div id="div2">
<button id="sadd" type=submit>Add Entries</button>
</div>
</form>
<form action="EntryController" method="get">
<input id ="remove" name="choice" value="remove"/>
<div id="div3">
<button id="rlist" type=submit>Remove Entries</button>
</div>
</form>
<form action="EntryController" method="get">
<input id ="list" name="choice" value="list"/>
<div id="div4">
<button id="elist" type=submit>List Entries</button>
</div>
</form>
</div>
</body>
</html>