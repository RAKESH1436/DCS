<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
<h2>Location search Result</h2>
<table border="1">
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Type</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id }</td>
<td>${location.code }</td>
<td>${location.name}</td>
<td>${location.type }</td>
<td><a href="deleteLocation?id=${location.id}">del</a></td>
<td><a href="updateLocation?id=${location.id}">Update</a></td>
</tr>
</c:forEach>
</table>
<a href="saveLocation">click to add new location</a>


</body>
</html>