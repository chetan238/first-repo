<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<table border="1px solid black">

<tr>
	<th>ID </th>
	<th>Country Name </th>
	<th>Country Desc</th>
	<th>Action</th>
</tr>

<c:forEach items="${SD}" var="a">
<tr>
	<td>${a.id}</td>
	<td>${a.cn}</td>
	<td>${a.cd}</td>
	<td><a href="delete.html?delete_id=${a.id}">delete /</a>&nbsp;&nbsp;
	<a href="edit.html?edit_id=${a.id}">edit </a></td>
	
</tr>
</c:forEach>

</body>
</html>