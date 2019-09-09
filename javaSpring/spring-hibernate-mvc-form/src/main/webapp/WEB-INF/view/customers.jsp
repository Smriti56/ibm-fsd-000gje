<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Customer List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Email</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="cust" items="${customer}">   
   <tr> 
   <td>${cust.id}</td>  
   <td>${cust.firstName}</td>  
   <td>${cust.lastName}</td>  
   <td>${cust.email}</td>  
 
   <td><a href="edit/${cust.id}">Edit</a></td>  
   <td><a href="delete/${cust.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>
</head>
<body>

</body>
</html>