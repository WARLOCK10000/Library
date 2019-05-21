<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="FirstServlet" method= "post">
		<input type="hidden" name="action" value="save_book" />
		<label> Enter book title:</label> <input type="text" name="book_title" />
		<input type="submit" value="save book" />
	</form>
</body>
</html>