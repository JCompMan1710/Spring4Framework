<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Spring 4 MVC - HelloWorld</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet"  type="text/css" />
    </head>
    <body>
        <%@ include file="/WEB-INF/views/menu.jsp" %>
        <div style="text-align:center">
            <h2>
                ${message} 
            </h2>
        </div>
        <%@ include file="/WEB-INF/views/footer.jsp" %>
    </body>
</html>