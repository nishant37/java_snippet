<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page isELIgnored="false" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Vendors:</h2>

<table border="2"  style="width:100%">

<tr>

<th><b>ID</b></th>
<th><b>CODE</b></th>
<th><b>NAME</b></th>
<th><b>TYPE</b></th>
<th><b>EMAIL</b></th>
<th><b>PHONE</b></th>
<th><b>ADDRESS</b></th>
<th><b>DELETE</b></th>
<th><b>UPDATE</b></th>

</tr>

<c:forEach items="${vendor}" var="vendor">
<tr>
<td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.type}</td>
<td>${vendor.email}</td>
<td>${vendor.phone}</td>
<td>${vendor.address}</td>
<td><a href="deleteVendor?id=${vendor.id}">Delete Vendor</a></td>
<td><a href="showUpdate?id=${vendor.id}">Update Vendor</a></td>
</tr>
</c:forEach>

</table>

<a href="showVendors">Add Vendor</a>

</body>
</html>