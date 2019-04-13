<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="saveVendor" method="post">
<pre>
Id:<input type="text" name="id">
Code:<input type="text" name="code">
Name:<input type="text" name="name">
Type:Permanent <input type="radio" name="type" value="Permanent"/>
Contract <input type="radio" name="type" value="Contract"/>
Email:<input type="text" name="email">
Phone Number:<input type="text" name="phone">
Address:<textarea rows="4" cols="50" name="address"></textarea>
<input type="submit" value="Save"/>
</pre>

</form>

${msg} 

<a href="displayVendors">View Vendors</a>
</body>
</html>