<%@page import="com.luv2code.myapp.entity.Instructor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
session.setAttribute("I",new Instructor(fname,lname,email));

%>

<form action="controller.do" method="post">

youtube channel<input type="text" name="yc"><br/>
hobby<input type="text" name="hobby"><br/>
<input type="submit">

</form>
</body>
</html>