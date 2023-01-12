<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Info</title>
<style>
	#btn
	{
		position:absolute;
		margin-left:-50px;
		margin-top:200px;
		height:40px;
		width:65px;
	}
</style>
</head>
<body>
	<form action="Welcome.jsp">
	Name<br>
	<input type="text" id="name" placeholder="Name...">
	<br>ID<br>
	<input type="text" id="id" placeholder="ID...">
	<br>PW<br>
	<input id="pw" type="password" placeholder="PW...">
	<br>Age<br>
	<input id="age" type="text" placeholder="Your age...">
	<br><br>Select your sex<br>
	<!-- Use same values on names for users to select single value only from radio input, and use different values for multiple values.-->
	<input type="radio" name="sex" value="Male">Male
	<input type="radio" name="sex" value="Female">Female
	<br><br>Tell me about your hobby!<br>
	<input type="checkbox" name="hobby1" value="Excercise">Exercise
	<input type="checkbox" name="hobby2" value="Game">Game
	<input type="checkbox" name="hobby3" value="Watching TV">Watching TV
	<input type="checkbox" name="hobby4" value="Walking the dogs">Walking the dogs
	<br><br>Your birth date?<br>
	<input type="date" name="birthday" value="Year-Month-Day" min="1900-01-01" max="2023-12-31">
	<br><br>
	<label for="ageGroup">How old are you?</label>
	<br>
	<select name="ageGroup">
		<option value="">Select...</option>
		<option value="Teenager">Teenager</option>
		<option value="Twenty">20s</option>
		<option value="Thirty">30s</option>
		<option value="Fourty">40s</option>
		<option value="Fifty">50s</option>
	</select>
	<br><br>Introduce us about yourself!<br>
	<textarea rows="15" cols="35" name="Introduction" placeholder="Write here!"></textarea>
	<br><br>Submit<br>
	<input id="sbmit" value="SendingData" type="submit">
	<br><br>Reset<br>
	<input id="reset" value="ResetData" type="reset">
	</form>
</body>
</html>