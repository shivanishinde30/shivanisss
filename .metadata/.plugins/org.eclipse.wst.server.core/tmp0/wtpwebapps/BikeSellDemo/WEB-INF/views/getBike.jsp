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
<table border="2">
<c:forEach var="b" items="${blist}">

<tr>
<td>${b.oname}</td>
<td>${b.bname}</td>
<td>${b.price}</td>
<td>${b.disc}</td>
<td>${b.color}</td>
<td>${b.type}</td>
<td><a href="edit/${b.price}">Edit</a>/
<a href="delete/${b.price}">Delete</a>
</tr>
</c:forEach>
</table>
<a href="addBike1">Add Bike</a>
</body>
</html>