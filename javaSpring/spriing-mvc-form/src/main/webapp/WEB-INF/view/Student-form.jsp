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
<form:form action="processform" modelAttribute="student" method="post">
First Name:<form:input path="firstName"/><br/>
Last Name:<form:input path="lastName"/><br/>
Country:<form:select path="country">
<form:options items="${student.countryOptions}" /></form:select><br/>
Operating System
Linux<form:checkbox  path="operatingSystems" value="Linux"/>
Windows<form:checkbox  path="operatingSystems" value="Windows"/>
MacOS<form:checkbox  path="operatingSystems" value="MacOS"/><br/>
Favourite Language:JAVA<form:radiobutton path="favouriteLanguage"  value="JAVA"/>
C#<form:radiobutton path="favouriteLanguage"  value="C#"/>
PYTHON<form:radiobutton path="favouriteLanguage"  value="Python"/>
Ruby<form:radiobutton path="favouriteLanguage"  value="Ruby"/><br/>
<input type="submit" value="Add"/>
</form:form>


<form:form action="search" modelAttribute="student1" method="post">
First Name:<form:input path="value"/><br/>
Search By:firstname<form:radiobutton path="type"  value="firstName"/>
lastname<form:radiobutton path="type"  value="lastName"/>
<input type="submit" value="Search"/>
</form:form>



<a href="list">Click to view the list</a>




</body>
</html>