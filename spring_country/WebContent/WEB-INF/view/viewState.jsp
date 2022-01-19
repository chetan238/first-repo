<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1 px solid black">
	<tr>
		<th>ID</th>
		<th>State Name</th>
		<th>Desc</th>
		<th>Action</th>
	</tr>
<c:forEach items="${SSD}" var="a">
<tr>
	<td>${a.id}</td>
	<td>${a.sn}</td>
	<td>${a.sd}</td>
	<td><a href="deleteState.html?delete_id=${a.id}">delete /</a>&nbsp;&nbsp;
	<a href="editState.html?edit_id=${a.id}&country_id="${a.cm.id}">edit </a></td>
	
</tr>

</c:forEach>

</table>
</body>
</html>