<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report card</title>
<style>
    #helpMsg
    {
    	text-align:center;
        color:green;
        font-weight:bold;
    }
    #table, input
    {
    	width:300px;
	}
	#table
	{
		height: 1200px;
	}
	.inputCls
	{
		text-align:center;
		height:30px;
	}
	.picInput
	{
		margin-left:20%;
	}
</style>
</head>
<body>
	<form action="../Jan16_02/JSP02/out2.jsp">
	  	  <table id="table" border="1" align="center">
	  	  	<tr>
	  	  		<th>
		        	<p>Enter your name</p>
		        </th>
		    </tr>
		    <tr>
                <td>
		        	<input type="text" name="nameVal" placeholder="Name..." class="inputCls" required>
                </td>
		   	</tr>
            <tr>
                <th>
		            <p>Enter your score in Business Korean</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="number" name="korVal" min="0" max="100" step="1" placeholder="Score..." class="inputCls" required>
                </td>
            </tr>  
            <tr> 
                <th>
		            <p>Enter your score in Basic English</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="number" name="engVal" min="0" max="100" step="1" placeholder="Score..." class="inputCls" required>
                </td>
            </tr>
		    <tr>
                <th>
		            <p>Enter your score in American History</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="number" name="hisVal" min="0" max="100" step="1" placeholder="Score..." class="inputCls" required>
                </td>
            </tr>
            <tr>
                <th>
		            <p>Enter your score in Mathematics</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="number" name="mathVal" min="0" max="100" step="1" placeholder="Score..." class="inputCls" required>
                </td>
            </tr>
            <tr>
                <th>
		            <p>Choose your profile picture</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="file" name="profilePic" class="picInput">
                </td>
		    </tr>
            <tr>
                <th>
		            <p>Enter your age</p>
                </th>
            </tr>
            <tr>
                <td>
		        	 <input type="number" name="age" min="1" max="125" step="1" placeholder="Age..." class="inputCls" required>
                </td>
		    </tr>
            <tr>
                <th>
		            <p>Enter your birth date</p>
                </th>
            </tr>
            <tr>
                <td>
		        	<input type="date" name="birthdate" placeholder="Birth date..." class="inputCls" required>
                </td>
		    </tr>
            <tr>
                <td>
		            <p id="helpMsg">Thank you for your help, please click the button below to submit your data.</p>
                </td>
		    </tr>
            <tr>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
	        </table>
	</form>
</body>
</html>