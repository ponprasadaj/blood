<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href=css/donorlogin.css>
</head>
<body>
<div align=center>
<h1>UserLogin</h1>
<form action="donorlogin" method="post" onsubmit="return validate()" >
<table>
<tr><td>username:</td><td><input type=text name=txtusername></td></tr>
<tr><td>password:</td><td><input type=text name=txtpwd></td></tr>
<tr><td><input type=submit name="btn_login" value=Login></td> <td><input type=reset></td></tr>	
<ul>

<a href="donorregistration.jsp"> new user</a>

</ul>
</table>
</form>
</div>
</body>
</html>