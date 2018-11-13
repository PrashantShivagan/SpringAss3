<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Table border=1px>
<tr>
<th>Session ID</th>
<th>Session Course</th>
<th>Session Duration</th>
<th>Session Faculty</th>


</tr>
<a:forEach var="sess" items="${temp}">
<tr>
<td>${sess.sessionid}</td>
<td>${sess.sessioncourse}</td>
<td>${sess.sessiondur}</td>
<td>${sess.sessionfaculty}</td>
<td><a href="purchase.jsp?mobName=${sess.sessionName}">Enroll</a></td>
</tr>

</a:forEach>
</Table>
</body>
</html>