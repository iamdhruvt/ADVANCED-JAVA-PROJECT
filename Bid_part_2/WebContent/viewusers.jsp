<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  
<%@page import="com.oas.dao.UserDao,com.oas.bean.*,java.util.*"%>  

  
<h1>Users List</h1>  
  
<%  
List<User> list=UserDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>id</th><th>quote</th> 
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getQuote()}</td>  
</tr>
</c:forEach>
</tr>
</table>
</body>  
</html> 