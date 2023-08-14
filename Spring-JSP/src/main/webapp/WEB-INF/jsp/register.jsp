<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>>

<html>
<head>
<title>Login Page</title>
</head>
  <body>
  <h2>${errorMsg}</h2> 
  <form:form method="post" modelAttribute="user">
  <form:input type="text" class = "form-control" path = "userId"placeholder="User ID"/>
  <br> 
  <form:input type="password"class ="form-control" path="password"placeholder="Password"/>
  <br>
  <form:button type = "submit" class ="">Register   </form:button>
  </form:form>
  </body>
</html>