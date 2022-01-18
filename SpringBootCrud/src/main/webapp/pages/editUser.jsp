<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title></title></head>
<body>
<form:form action="edit" modelAttribute="emp">
<table>
    <tr>
        <td><form:hidden path="LoginId" /></td>
    </tr>
    <tr>
        <td><form:label path="userName">Username</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    
    <tr>
        <td><form:label path="passWord">Password</form:label></td>
        <td><form:input path="passWord" /></td>
    </tr>

</table>
    <input type="submit" value="Edit Employee"/>
</form:form>
</body>
</html>