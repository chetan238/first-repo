<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="f" uri="http://java.sun.com/jstl/core_rt"%>
	<%@  taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
	<c:form action="insertstate.html" method="post" modelAttribute="SD">

		Select State :
				<select name="cid" id="c">
			<f:forEach items="${state}" var="a">
				<f:set value="${a.id}" var="x"></f:set>
				<f:set value="${a.cn}" var="y"></f:set>
				<f:set value="${a.cd}" var="z"></f:set>

				<option value="${x}">${y}</option>
			</f:forEach>
			</select>
			 Enter State<c:input path="sn" /><br><br>
			  State Dec<c:input path="sd" /><br><br>
			  <c:hidden path="id"/>
			  <input type="submit">
	</c:form>
</body>
</html>