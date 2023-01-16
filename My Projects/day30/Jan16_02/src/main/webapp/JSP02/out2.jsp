<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!

	String name;
	int kor,eng,history,math;
	int age;
	String birthdate;
	double total,avrg;
%>
<% 
	response.setCharacterEncoding("utf-8");
	name=request.getParameter("nameVal");
	birthdate=request.getParameter("birthdate");
	
	kor=Integer.parseInt(request.getParameter("korVal"));
	eng=Integer.parseInt(request.getParameter("engVal"));
	history=Integer.parseInt(request.getParameter("hisVal"));
	math=Integer.parseInt(request.getParameter("mathVal"));
	total=((double)kor+(double)eng+(double)history+(double)math);
	avrg=total/4;
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome!<%=" "+name%>!</h1>
	<table border="1" align="center">
		<tr>
				<th>
					<p>Your birth date</p>
				</th>
			</tr>
			<tr>
				<td>
					<p><%= birthdate %></p>
				</td>
		</tr>
		<tr>
			<th>
				<p>Your Score in Korean</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= kor %></p>
			</td>
		</tr>
		<tr>
			<th>
				<p>Your Score in English</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= eng %></p>
			</td>
		</tr>
		<tr>
			<th>
				<p>Your Score in History</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= history %></p>
			</td>
		</tr>
		<tr>
			<th>
				<p>Your Score in Mathematics</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= math %></p>
			</td>
		</tr>
		<tr>
			<th>
				<p>Score avrage</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= avrg %></p>
			</td>
		</tr>
		<tr>
			<th>
				<p>Score total</p>
			</th>
		</tr>
		<tr>
			<td>
				<p><%= total %></p>
			</td>
		</tr>
	</table>
	<%
		if(age < 19)
		{
			
			%>
			<p>You are under 19, and minor.</p>
			<a target="_blank" href="https://4.bp.blogspot.com/-XkVf70Ovtvg/WK7ehxKmVqI/AAAAAAABB80/OgD44maGui0CGy8mhhq66ro9CZACoOciQCLcB/s800/banzai_school.png">Click here to check the image.</a>
			<%
		}
		else
		{
			%>
			<p>You are 19 or above, and adult.</p>
			<a target="_blank" href="https://otona-outdoors.com/wp-content/uploads/2018/05/pose_tokei_kakunin_man.png">Click here to check the image.</a>
			<%
		}
	%>
</body>
</html>