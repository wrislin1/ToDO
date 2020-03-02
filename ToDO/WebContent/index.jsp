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
<h1 id="menu">Welcome to Your To Do List</h1>
<hr>
<div id ="div1">
<form action="EntryController" method="post">
<input id ="add" name="choice" value="add"/>
<div id="div2">
<button id="sadd" type=submit>Add Entries</button>
</div>
</form>
<form action="EntryController" method="post">
<input id ="remove" name="choice" value="remove"/>
<div id="div3">
<button id="rlist" type=submit>Remove Entries</button>
</div>
</form>
<form action="EntryController" method="get">
<input id ="list" name="choice" value="list"/>
<div id="div4">
<button id="elist" type=submit>View Your To Do List</button>
</div>
</form>
</div>
<hr>
</body>
</html>