    <!-- 지시자 -->
    <%-- --%>
    <%@ page contentType="text/html; charset=UTF-8" %> 
    <%@ page pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title></title>
    </head>
    <body>
        <form action="..\Jan16_02\out.jsp">
            <p>Name</p>
            <input type="text" name="Name" required>
            <p>Age</p>
            <input type="text" name="Age" required>
            <div class="phone">
                <p>Phone number</p> 
                <input type="tel" name="tel0" pattern="[0-1]{3}}]" required>
                -
                <input type="tel" name="tel1" pattern="[0-9]{4}}" required>
                -
                <input type="tel" name="tel2" pattern="[0-9]{4}}" required>
            </div>
            <!----------------------------------------------->
            <p><input type="submit" value="Send"></p>
        </form>
    </body>
    </html>