<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location</title>
</head>
<body>
<h2>Enter the location details to be saved....</h2>
<form action="saveLocationInfo" method="post">
<pre>
id:<input type="text" name="id" /> 
code:<input type="text" name="code"/>
name:<input type="text"  name="name"/>
type:Urban<input type="radio" name="type" value="urban">
Rural<input type="radio" name="type" value="rural" />
<input type="submit" value="save" />
</pre>
</form>
${msg }
<a href="getLocations">click to see all locations </a>
<a href="http://localhost:9090/searchlocationweb17/searchlocation">click search location by id</a>
</body>
</html>