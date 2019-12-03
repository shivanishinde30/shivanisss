<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateBook">
Book Id: <input type="text" name="bid" value="${b.bid}"readonly><br>
Book Name: <input type="text" name="bname" value="${b.bname}"><br>
Book Price: <input type="text" name="price"  value="${b.price}"><br>
Book Quantity: <input type="text" name="qty" value="${b.qty}"><br>
<input type="submit" name="btn" value="Update Book">
</form>
</body>
</html>