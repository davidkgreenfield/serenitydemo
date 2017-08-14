<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
Hello ${name}, please tell us your favorites:
<br>
<br>
<form:form method="POST" modelAttribute="favorites">
    <TABLE>
        <tr>
            <td><form:label path="iceCream">ice cream</form:label></td>
            <td><form:input path="iceCream"/></td>
        </tr>
        <tr>
            <td><form:label path="sportsTeam">sports team</form:label></td>
            <td><form:input path="sportsTeam"/></td>
        </tr>
        <tr>
            <td><form:label path="rockGroup">rock group</form:label></td>
            <td><form:input path="rockGroup"/></td>
        </tr>
        <tr>
            <td><form:label path="movie">movie</form:label></td>
            <td><form:input path="movie"/></td>
        </tr>
        <tr>
            <td><form:label path="vacation">vacation</form:label></td>
            <td><form:input path="vacation"/></td>
        </tr>
        <tr>
            <td>
                <p><input id="submit" type="submit" value="Submit" />
            </td>

        </tr>
    </TABLE>
    <form:hidden id="userName" path="userName" />
</form:form>

</body>
</html>