<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processform" modelAttribute="customer" method="post">
First Name:<form:input path="firstName"/><br/>
Last Name:<form:input path="lastName"/><br/>
Email:<form:input path="email"/><br/>

<input type="submit" value="Add"/>
</form:form>



</body>
</html>