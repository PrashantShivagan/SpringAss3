<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="b" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=2px>
<b:form action="dedata" method="post" modelAttribute="z">
<td>Please Enter Trainee Id
<b:input path="traineeId"/>
<input type="submit" value="Delete"/>
</td>
</b:form>
</table>
</body>
</html>