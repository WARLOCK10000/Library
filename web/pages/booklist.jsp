<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Book list</title>
</head>
<body>

book list:
<c:forEach var="book" items="${books}">
    <a href="FirstServlet?action=view_book&book_id=${book.id }">
        <c:out value="${book}"/> </a>
</c:forEach>
</body>
</html>