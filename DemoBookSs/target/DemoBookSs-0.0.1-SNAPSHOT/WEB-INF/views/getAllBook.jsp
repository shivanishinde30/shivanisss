<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<c:forEach var="p" items="${blist}">
<tr>
<td>${p.bid}</td>
<td>${p.bname}</td>
<td>${p.price}</td>
<td>${p.qty}</td>
<td><a href="delete/${p.bid}">delete</a>/
<a href="edit/${p.bid}">edit</a>
</td>
</tr>
</c:forEach>
</table>
<a href="addBook">Add Book</a>
</body>
</html>