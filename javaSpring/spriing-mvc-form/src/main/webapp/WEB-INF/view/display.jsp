<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
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
FirstName:"${student.firstName}"
LastName:"${student.firstName}"
Country:"${student.country}"
<br/>
<ul>  
<c:forEach var="os" items="${student.operatingSystem}">  
<li>${os}</li>  
</c:forEach>  
</ul>  
</body>
</html>