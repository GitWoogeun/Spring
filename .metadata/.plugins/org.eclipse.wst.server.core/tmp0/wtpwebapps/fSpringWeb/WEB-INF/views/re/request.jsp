<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>

request.do 요청에 의한 뷰 페이지 입니다.<br/>
아이디 : ${param.id}<br/>
이름 : ${param.name }<br/>
나이 : ${param.age }<br/>
<hr/>

<!-- 클래스는 무조건 대문자 -->
아이디 : ${vo.id}<br/>
이름 : ${vo.name }<br/>
나이 : ${vo.age }<br/>
<hr/>

<!-- 변수는 무조건 소문자 -->
<h2>권장합니다.</h2>
아이디 : ${memberVO.id}<br/>
이름 : ${memberVO.name }<br/>
나이 : ${memberVO.age }<br/>
<hr/>

</body>
</html>