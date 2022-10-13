<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="registerform">
<h2> Please submit the request Form.</h2>
<form action="bloodrequest" method="post" >
<p>Firstname</p>
<input type="text" name="Firstname" placeholder="Firstname">
<p>Lastname</p>
<input type="text" name="Lastname" placeholder="Lastname">
<p>BloodGroup</p>
<input type="text" name="bloodgroup" placeholder="Bloodgroup">
<p>No of units</p>
<input type="text" name="no of units" placeholder="No of units">
<p>Mobile No</p>
<input type="number" name="Mobile no" placeholder="mobile No">
<p>Email id</p>
<input type="email" name="email" placeholder="Email id">
<p>Location</p>
<input type="text" name="email" placeholder="Location">
<button>Submit</button> 
</form>
</div>
</body>
</html>