<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>Update location information</h2>
<form action="updateLocationData" method="post">
<pre>
id:<input type="text" name="id" value="${location.id}" > 
code:<input type="text" name="code" value="${location.code}">
name:<input type="text"  name="name" value="${location.name}">
type:Urban<input type="radio" name="type" value="urban">
Rural<input type="radio" name="type" value="rural" />
<input type="submit" value="update" />
</pre>
</form>

</body>
</html>