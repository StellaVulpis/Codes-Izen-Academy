<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Report card</title>
<style>
    #sex_selection
    {
        height: 60px;
    }
    table
    {
     width: 358.13px;
    }
    #favFoodSel
    {
     width:200px;
    }
    #memoField
    {
        height:250px;
       	width:340px
    }
    .finalBtn
    {
    	width:345px;
    	height:50px;
    }
</style>
</head>
<body>
    <form action="Welcome.jsp">
        <table id="Info" border="1" align="center">
            <tr>
                <th>Your name</th>
                <td><input type="text" placeholder="Name..." required></td> <!-- Name -->
            </tr>
            <tr>
                <th>Score in Korean</th>
                <td><input type="text" placeholder="Score..." required></td> <!-- Korean -->
            </tr>
            <tr>
                <th>Score in English</th>
                <td><input type="text" placeholder="Score..." required></td> <!-- English -->
            </tr>
            <tr>
                <th>Score in Mathematics</th>
                <td><input type="text" placeholder="Score..." required></td> <!-- Math -->
            </tr>
            <tr>
                <th>Your phone number</th>
                <td><input type="tel" name="phone" placeholder="010-1234-5678"
                    pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" required></td> <!-- Phone -->
            </tr>
         </table>
         <table id="sex_selection" border="1" align="center">
            <tr>
            <th>Your sex</th> <!-- Sex -->
            <td><input  type="radio" name="sex" value="Male" required>Male</td>
            <td><input  type="radio" name="sex" value="Female" required>Female</td>
            <td><input  type="radio" name="sex" value="Other" required>Other</td>
            <td><input  type="radio" name="sex" value="Prefer not to answer" required>Prefer not to answer</td>
            </tr>
         </table>
         <table id="FavFoods" border="1" align="center">
            <tr>
                <th>Your favorite food</th>
                <td>
                    <select id="favFoodSel" required> <!-- Favorite food -->
                        <option value="">Please select...</option>
                        <option value="Apple pie">Apple pie</option>
                        <option value="Ice cream">Ice cream</option>
                        <option value="Ramen">Ramen</option>
                        <option value="Cinnamon Rolls">Cinnamon Rolls</option>
                    </select>
                </td>   
            </tr>
        </table>
        <table id="hobby" border="1" align="center">
        <tr>
                <th>What is your hobby?</th>
		</tr>
                <!-- Hobby -->
		<tr>
                <td><input type="checkbox" name="sel1" value="Game" required>Game</td>
		</tr>
		<tr>
                <td><input type="checkbox" name="sel2" value="Watching TV" required>Watching TV</td>
		</tr>
		<tr>
                <td><input type="checkbox" name="sel3" value="Working out" required>Working out</td>
		</tr>
		<tr>
                <td><input type="checkbox" name="sel4" value="Dog walking" required>Dog walking</td>
		</tr>
		<tr>
                <td><input type="checkbox" name="sel5" value="Traveling" required>Traveling</td>
        </tr>
        </table>
        <table id="specialty" border="1" align="center">
            <tr>
                <th>Tell us your specialty!</th>
            </tr>
            <tr>
                <td><textarea id="memoField" placeholder="Write here..."></textarea></td> <!-- Specialty -->
            </tr>
        </table>
        <table id="sb_rs" border="1" align="center">
            <tr>
                <td><input class="finalBtn" type="submit" value="Submit"></td>
            </tr>
            <tr>
                <td><input class="finalBtn" type="submit" value="Reset"></td>
            </tr>
        </table>
    </form> 
</body>
</html>