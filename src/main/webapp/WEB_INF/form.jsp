<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SanathkumarProject-2/getEmployee" >
	<label for="Name">Name:</label><br>
  <input type="text" id="Name" name="name"><br>
  <label for="Id">Id:</label><br>
  <input type="number" id="Id" name="id"><br>
   <label for="number">Salary:</label><br>
  <input type="number" name="salary"><br>
  <button type="submit" value="Submit">Register</button>
</form>
</body>
</html>