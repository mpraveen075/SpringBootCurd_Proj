<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<html>
    <head>
        <title>SELECT Operation</title>
        
    </head>
    <body>
 
        
        <form>
            <table border="1" width="40%">
                <caption>Employee List</caption>
                <tr>
                    <th>Login Id</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th colspan="2">Action</th>
                </tr>
              <c:forEach var="row" items="${list}">   
                    <tr>
                        <td><c:out value="${row.loginId}"/></td>
                        <td><c:out value="${row.userName}"/></td>
                         <td><c:out value="${row.passWord}"/></td>
                          
                      <td><a href="editEmp?id=${row.loginId}">Update</a></td>
                    
                     <td><a href="deleteEmp?id=${row.loginId}">Delete</a></td>      
                    </tr>
                </c:forEach>
            </table>
        </form>
       <a href="addUserForm">Register New Employee</a>  
    
</body>
</html>