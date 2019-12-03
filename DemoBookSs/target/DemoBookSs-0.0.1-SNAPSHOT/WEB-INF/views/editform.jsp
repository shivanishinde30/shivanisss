<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><title>Insert title here</title>
</head>
<body>

<form action="updateBook">
Book Id: <input type="text" name="bid" value="${b.bid}" readonly>
New Book Name: <input type="text" name="bname" value="${b.bname}">
Book Price: <input type="text" name="price" value="${b.price}">
Book Quantity: <input type="text" name="qty" value="${b.qty}">
<input type="submit" name="btn" value="Submit">
</form>
</body>
</html>