<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Spring 4 MVC - Employee List</title>
    </head>
    <body>
        <div style="text-align:center">
            <c:forEach items="${employeeList}" var="employee">
                ${employee.id}: ${employee.lastName}, ${employee.firstName}<br>
            </c:forEach>
        </div>
        <a href="showEmployeeForm">Add Another</a><br><br><br>
        <a href="index.jsp">Home</a>
    </body>
</html>