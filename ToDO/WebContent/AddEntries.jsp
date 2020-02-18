<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Entry</title>
</head>
<body>
<header><a href="index.jsp">Return to Menu</a></header>
Add
	<hr>
	<form action="EntryController" method="get">
		<table>
			<tr>
				<td>Entry</td>
				<td><input type="text" name="choice"></td>

			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>
</body>
</html>