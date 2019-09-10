<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Country</th><th>OS</th></th><th>FavouriteLanguage</th></tr>  
   <c:forEach var="stu" items="${stulist}">   
   <tr> 
   <td>${stu.id}</td>  
   <td>${stu.firstName}</td>  
   <td>${stu.lastName}</td>  
   <td>${stu.country}</td>  
   <td>${stu.operatingSystems}</td>  
   <td>${stu.favouriteLanguage}</td>
 
   </tr>  
   </c:forEach>  
   </table>
</body>
</html>