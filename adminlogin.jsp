<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>	
<link rel="stylesheet" href="css/Adminlogin.css">
<body>
<div align=center>
<h1>UserLogin</h1>
<form action=administratorloginservlet method=post>
<table>
<tr><td>username:</td><td><input type=text name=txtname></td></tr>
<tr><td>password:</td><td><input type=text name=txtpwd></td></tr>
<tr><td><input type=submit value=Login></td> <td><input type=reset></td></tr>	

</table>
</form>
</div>
</body>
</html>