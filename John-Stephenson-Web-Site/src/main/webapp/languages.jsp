<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Languages Used</title>
    </head>
    <body>
        <%@ include file="/WEB-INF/views/menu.jsp" %>
        <div style="text-align:center">
            <h2>Programming Languages used</h2>
            <table style="width:100%; border:1px solid black;">
                <tr>
                    <th></th>
                    <th>Tool</th>
                    <th>Technology</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Java</td>
                    <td><a href="spring.jsp">Spring</a></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Java</td>
                    <td><a href="http://www.goospoos.com/2009/12/spring-mvc-application-flow-with-diagram/">Spring MVC</a></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Java</td>
                    <td><a href="jsf.jsp">JSF</a></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>Java</td>
                    <td><a href="http://www.eclipse.org/downloads/">Eclipse IDE</a></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>Java</td>
                    <td><a href="https://www.jetbrains.com/idea/download/">IntelliJ IDE</a></td>
                </tr>
<!--                    <c:forEach items="${languagesList}" var="languages">
                        ${languages.id}: ${languages.technology}, ${languages.languages}<br>
                    </c:forEach>
                </tr>
-->            </table>
        </div>
        <%@ include file="/WEB-INF/views/footer.jsp" %>
    </body>
</html>