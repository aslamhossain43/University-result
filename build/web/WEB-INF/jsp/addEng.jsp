<%-- 
    Document   : addEng
    Created on : Jan 31, 2018, 9:17:23 AM
    Author     : Atif Aslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <h1 align="center">Add result in Engineering</h1>
        <table border="1" align="center">
            <form:form method="post" action="/WebApplicationMVC_Project2/adminFPE/">
                <tr><td><input type="submit" value="Food & Process Engineering"/></td></tr>           
                    </form:form>
                    <form:form method="post" action="/WebApplicationMVC_Project2/adminAE/">
                <tr><td><input type="submit" value=" Agricultural Engineering"/></td></tr>           
                    </form:form>
                    <form:form method="post" action="/WebApplicationMVC_Project2/adminAR/">
                <tr><td><input type="submit" value="Architecture"/></td></tr>           
                    </form:form>
                    <form:form method="post" action="/WebApplicationMVC_Project2/adminCE/">
                <tr><td><input type="submit" value="Civil Engineering"/></td></tr>           
                    </form:form>
                    <form:form method="post" action="/WebApplicationMVC_Project2/adminME/">
                <tr><td><input type="submit" value="Mechanical Engineering"/></td></tr>           
                    </form:form>

        </table>

    </body>
</html>
