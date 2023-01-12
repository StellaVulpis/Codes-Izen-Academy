<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE-Edge">
<title>My First JSP</title>
<style>
#bod
{
background-color:yellow;
background-image: url("img/FamilyGuy_Background.webp");
}
#BrianWebp
{
height:150px;
width:150px;
}
#PeterQuote
{
height:350px;
width:350px;
}
#Peterimg
{
margin-left:0px;
position:absolute;
}
#Peterimg-text
{
font-size:0.8em;
font-style:italic;
}
#BrianDescription
{
font-size:0.7em;
}
p
{
font-weight:bold;
}
#h,#t,#m,#l
{
color: yellow;
font-weight: bold;
}
#Peter-Link
{
background-repeat: no-repeat;
color: #87CEEB;
text-decoration:none;
cursor:hover;
}
#imgLinkDescription
{
font-weight:bold;
font-size:0.725em;
}

</style>
</head>
<body id="bod">
<p><em id="h">H</em> : Hyper</p>
<p><em id="t">T</em> : Text</p>
<p><em id="m">M</em> : Mark-up</p>
<p><em id="l">L</em> : Language</p>
<p>Today we'll study HTML.</p>
<p>=====================================================================================================</p>
<h3>Quote from 'Family Guy'</h3>
<figure>
<img src="img/Brian.webp" alt="Can't show the picture at this moment, please try again later." id="BrianWebp">
<!-- Source file must be located inside of 'webapp' folder. -->
<figcaption id="BrianDescription">Brian sipping on his martini.</figcaption>
</figure>
<div class="FamilyGuy-Quotes">
“I guess we’ve learned that no matter who you are or where you come from, life is a terrible thing.”<br>
“<b>Brian</b>, there’s a message in my alphabet <b>[cereal]</b>. It says ‘oooooo.’”<br>
“Well, you guys, we did it. We finally went to a restaurant without somebody yelling at us and the rest of the place applauding them.”<br>
“Oh jeez. This hangover’s killing me. I haven’t felt this crappy since the time I went to that museum.”<br>
“Let’s go drink until we can’t feel feelings anymore.”<br>
“What? Gosh, it’s not like the internet to go crazy about something small and stupid.”<br>
<b>“I got drunk and then got my picture taken."<br>"So that way, when I get pulled over for drunk driving I look the same as on my license.”</b><br>
“I can be just as non-competitive as anybody. Matter of fact, I’m the most non-competitive. So, I win.”
<br><br>
<figure id="Peterimg">
<figcaption id="imgLinkDescription">▼ Click on the image to visit the website with original source. ▼</figcaption>
<a id="Peter-Link" href="https://tvgag.com/gag/i-got-drunk-and-then-got-my-picture-taken/" target="_blank">
<img src="img/Peter_Quote.jpg" id="PeterQuote">
</a>
<figcaption id="Peterimg-text">Quote of Peter Griffin on Family Guy</figcaption>
</figure>
</div>
</body>
</html>