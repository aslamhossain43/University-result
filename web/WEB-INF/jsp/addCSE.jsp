<%-- 
    Document   : addCSE
    Created on : Jan 31, 2018, 9:16:42 AM
    Author     : Atif Aslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   
    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <table border="1" align="center">
          
               <form:form method="post" action="/WebApplicationMVC_Project2/adminCSE/">
                <tr><td><input type="submit" value=" CSE"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminECE/">
                <tr><td><input type="submit" value="ECE"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminEEE/">
                <tr><td><input type="submit" value="EEE"/></td></tr>           
            </form:form>
        </table>
    </body>
</html>
