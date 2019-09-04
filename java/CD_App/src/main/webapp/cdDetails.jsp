<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="controller.do">
Title:<input type="text" name="title"><br/>
Artist:<input type="text" name="artist"><br/>
Cost:<input type="text" name="cost"><br/>
CD Type:<select name="cdtype">
<option value="special_edition_cd">Special Edition</option>
<option value="international_cd">International CD</option>
</select>
<input type="submit" value="Submit">
</form>



</body>
</html>