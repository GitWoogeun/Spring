<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param2.jsp</title>
</head>
<body>
이름 : ${vo.name }<br/>		   <!-- Controller에서 mv.addObject("vo",vo); -->
아이디 : ${memberVO.id }<br/>   <!-- 생성된 객체 ModelAndView의 변수를 가져옴 -->
나이 : ${param.age }<br/>       <!-- 파라메터의 값을 받아서 변수를 가져옴 -->
	
<hr/>
세션값 : ${sessionScope.login }
</body>
</html>