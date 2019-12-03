<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addBike">
<table>

<tr>
<td>Enter Owner's Name</td>
<td><input type="text" name="oname"></td>
</tr>

<tr>
<td>Enter Bike's Name</td>
<td><input type="text" name="bname"></td>
</tr>

<tr>
<td>Bike Rate</td>
<td><input type="text" name="rate"></td>
</tr>

<tr>
<td>Bike Discription:</td>
<td><textarea  rows="2" cols="20" name="disc" ></textarea></td>
</tr>

<tr>
<td>Bike's color:</td>
<td>
<select name="color">
<option>Black</option>
<option>White</option>
<option>Silver</option>
<option>Yellow</option>
</select>
</td>
</tr>

<tr>
<td>Bike's type:</td>
<td>
<select name="type">
<option>Jupiter</option>
<option>Activa</option>
<option>Wego</option>
<option>Pleasure</option>
</select>
</td>
</tr>


<tr>
<td><input type="submit" name="btn" value="Register"></td>
</tr>

</table>
</form>
</body>
</html>