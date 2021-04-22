<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보확인</title>
<!-- Google Fonts -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,300italic,700,700italic">

<!-- CSS Reset -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css">

<!-- Milligram CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">

<!-- You should properly set the path from the main file. -->
<style>
	body{
		width: 1200px;
		margin: 0 auto;
	}

</style>
</head>
<body>
회원정보를 출력해주세요.
	<h1>회원정보</h1>
		
	<table border="1">
			<tr>
				<th bgcolor="whitesmoke" width="100">아이디</th>
				<th bgcolor="whitesmoke" width="200">이름</th>		
			</tr>
			<c:forEach items="${memberList}" var="member">
			<!-- 프라퍼티이름 변경 -->
			<tr>
				<td><a href="getBoard.do?userId=${member.userId }">${member.userId }</a></td>
				<td>${member.userName}</td>
			</tr>
			</c:forEach>
	</table>
</body>
</html>