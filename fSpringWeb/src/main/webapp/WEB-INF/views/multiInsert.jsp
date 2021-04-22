<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multiInsert.jsp</title>
</head>
<body>

<table border="1">
	<tr>
		<td>아이디</td><td>이름</td><td>나이</td>
	</tr>
	
<!-- memberVOList에 들어있는 list의 요소를 vo지정한다. -->	
<c:forEach var="vo" items="${memberVOList.list }">
<c:if test="${vo.state }">
	<tr>
		<td>${vo.id }</td>
		<td>${vo.name }</td>
		<td>${vo.age }</td>
	</tr>
</c:if>
</c:forEach>
</table>

</body>
</html>