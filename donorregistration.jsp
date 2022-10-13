<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New register</h2>
<form action="Newregistrationservlet" method="post" >
<div class="userdefine">
<div class="input-box">
<p>Firstname</p>
<input type="text" name="Firstname" placeholder="Firstname">
</div>

<div class="inputlast">
<p>Lastname</p>
<input type="text" name="Lastname" placeholder="Lastname">
</div>

<p>DOB</p>
<input type="Date" name="DOB" placeholder="DOB">

<p>BloodGroup</p>
<input type="text" name="bloodgroup" placeholder="Bloodgroup">

<p>Email id</p>
<input type="email" name="email" placeholder="Email id">

<p>Mobile No</p>
<input type="number" name="Mobile no" placeholder="mobile No">

<p>Address1</p>
<input type="text" name="Address1" placeholder="Address1">

<p>Address2</p>
<input type="text" name="Address2" placeholder="Address2">

<p>Address3</p>
<input type="text" name="Address3" placeholder="Address3">

<p>State</p>
<input type="text" name="State" placeholder="State">

<p>City</p>
<input type="text" name="City" placeholder="City">

<p>Password</p>
<input type="password" name="password" placeholder="password">

<p>Confirm Password</p>
<input type="password" name="Confirm Password" placeholder="Confirm Password">


<input type="submit" name="signup" value="register">
<h3>you have already account?<a href="donorlogin.jsp"> Login</a></h3>

</div>
</form>
<script src="script.js"></script>



</body>
</html>