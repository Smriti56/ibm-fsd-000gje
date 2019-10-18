<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>


<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Country</th><th>OS</th></th><th>FavouriteLanguage</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="stu" items="${studentList}">   
   <tr> 
   <td>${stu.id}</td>  
   <td>${stu.firstName}</td>  
   <td>${stu.lastName}</td>  
   <td>${stu.country}</td>  
   <td>${stu.operatingSystems}</td>  
   <td>${stu.favouriteLanguage}</td>
   <td><a href="editemp/${stu.id}">Edit</a></td>  
   <td><a href="delete/${stu.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="form">Add New Employee</a>  

 
</body>
</html>