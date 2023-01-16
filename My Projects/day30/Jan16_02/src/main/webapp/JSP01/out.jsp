<!-- 지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!-- 선언문 -->
<%!
	String name;
	String tel[] = new String[3];
	int age;
%>
<!-- 스크립트릿(자바코드) -->
<%
	// 한글 깨짐 방지
	response.setCharacterEncoding("utf-8");
	// 한글 깨짐 방지
	name=request.getParameter("Name");
	tel[0]=request.getParameter("tel0");
	tel[1]=request.getParameter("tel1");
	tel[2]=request.getParameter("tel2");
	age=Integer.parseInt(request.getParameter("Age"));
%>
<!-- html 코드 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식(출력부) -->
	<h1>Hi there!</h1>
	<p>Welcome, <%=" "+name %>.</p>
	<p>Your phone number is<%=" "+ tel[0]+"-"+tel[1]+"-"+tel[2] %>,</p>
	<p>and your age is <%=" "+age %>.</p>
</body>
</html>