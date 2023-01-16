    <!-- 선언부 -->
<%!
        String name;
        int age;
  %>
   <!-- 자바 코드 -->
  <%
    	name=request.getParameter("Name");
    	age=Integer.parseInt(request.getParameter("Age"));
    	// 한글 깨짐 방지
    	response.setCharacterEncoding("utf-8");
   %>
<!-- html 코드 -->

 <!-- 표현식 -->
    <%= %>	
	
<!-- html 코드 -->



<% 
<!-- 미성년 -->
if(age<19)
{	
	%>
	<a href="kids.jsp">Redirecting to minor page.</a>
	<%
}
<!-- 성년 -->
else
{
	%>
	<a href="adult.jsp">Redirecting to adult page.</a>
	<%
}
%>