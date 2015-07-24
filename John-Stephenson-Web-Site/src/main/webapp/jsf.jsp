<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Best JSF tutorials I have Used</title>
    </head>
    <body>
        <%@ include file="/WEB-INF/views/menu.jsp" %>
        <div style="text-align:center">
            <h2>WebSites I recommend to get started with JSF version 2.2</h2>
                <br><br>
            <table style="width:100%; border:1px solid black;">
                <h2>The main web site for JSF I recommend is as follows</h2>
                    <a href="http://coreservlets.com/">JSF CoreServlets</a>
            </table>
            <table style="width:100%; border:1px solid black;">
                <br><br>
                    <h2>To learn more about Templating visit</h2>
                        <a href="http://www.coreservlets.com/JSF-Tutorial/jsf2/#Templating">JSF Templating</a>
                            <h3>For practicing your coding skills scroll to <div style="color:red">Source code for exercise solutions.</div></h3>
                            <h2>Or you can click on <a href="http://www.coreservlets.com/JSF-Tutorial/jsf2/code/page-templating-exercises.zip">This Link</a></h2>
            </table>
            <table style="width:100%; border:1px solid black;">
                <br><br> 
                    <h2>To fix page-templating.zip file to work for you, here's what I did</h2>
                        <h3>1. Within the Package Explorer tab, I right clicked on the project, ==> build path ==> configure build path.</h3>
                        <h3>2. A pop-up box opens, select the Libraries tab ( if not already on that tab ).</h3>
                        <h3>3. Click on JRE System Library, click on the Edit button on the right.</h3>
                        <h3>4. I click on the Workspace default JRE</h3>
                        <h3>5. Click Finish</h3>
                        <h3>6. Click OK</h3>
            </table>
            <table style="width:100%; border:1px solid black;">
                <h2>My opinion of what I did for a better UX ( User Experience ).</h2>
                    <h3>1. Expand the project.</h3>
                    <h3>2. Expand WebContent</h3>
                    <h3>3. Double Click index.html</h3>
                    <h3>4. Delete lines 17 - 34.</h3>
                    <h3>5. Delete Lines 12 - 15.</h3>
                    <h3>  a. This is the line of <li><a href="welcome.jsf">welcome.jsf</a><br/> on line 16</li>h3>
                    <h3>NOTE: if you want to check your work, go back to the browser and refresh the main screen ( hit F5 ).</h3>
                    <h3>You should just see the title and a welcome.jsf link.</h3>
            </table>
        </div>
        <%@ include file="/WEB-INF/views/footer.jsp" %>
    </body>
</html>