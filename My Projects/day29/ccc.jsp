<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
.Seasons
{
font-weight:bold;
color:#87CEEB;
}
.SeasonLink
{
text-decoration:none;
color:#87CEEB;
}
.SeasonLink:hover
{
color:yellow;
text-decoration:none;
}
</style>
</head>
<body>
<figure>
<!-- Insert  -->
<figcaption id="decoText">Click the text to visit the page with image of specific season.</figcaption>
<ol>
<li id="spring" class="Seasons">
<a  class="SeasonLink" href="Spring.jsp">Spring</a>
</li>
<li id="summer" class="Seasons">
<a  class="SeasonLink" href="Summer.jsp">Summer</a>
</li>
<li id="fall" class="Seasons">
<a  class="SeasonLink" href="Fall.jsp">Fall</a>
</li>
<li id="winter" class="Seasons">
<a  class="SeasonLink" href="Winter.jsp">Winter</a>
</li>
</ol>
</figure>
</body>
</html>