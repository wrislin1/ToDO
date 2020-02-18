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
	<div >
	<form action="EntryController" method="get">
		<table>
			<tr>
				<td>Entry</td>
				<td><input id="addtext" type="text" name="choice"></td>

			</tr>
		</table>
		<input class="b" type="submit" value="Submit">
		
	</form>
	<form action="EntryController" method="get">
<input id ="list" id ="addbutton" name="choice" value="list"/>
<button class="b" type=submit>List Entries</button>
</form>
</div>
	<c:if test="${added}">
    <p>Entry has been added.</p>
	</c:if>
</body>
</html>