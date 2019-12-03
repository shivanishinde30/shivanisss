<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<c:forEach var="b" items="${blist}">
<tr>
<td>${b.bid}</td>
<td>${b.bname}</td>
<td>${b.price}</td>
<td>${b.qty}</td>
<td><a href="edit/${b.bid}">Edit</a>/
<a href="delete/${b.bid}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<a href="addBook"> Add book</a>
</body>
</html>