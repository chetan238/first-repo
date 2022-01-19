<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
	<c:form action="insert.html" method="post" modelAttribute="CD">
		Country Name :<c:input path="cn"/><br><br>
		Country Desc :<c:input path="cd"/><br><br>
		<c:hidden path="id"/>
		<input type="submit">
		

	</c:form>
</body>
</html>