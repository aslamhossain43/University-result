<%-- 
    Document   : addScience
    Created on : Jan 31, 2018, 9:18:04 AM
    Author     : Atif Aslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   
    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <h1 align="center">Add result in Science</h1>
         <table border="1" align="center">
          
               <form:form method="post" action="/WebApplicationMVC_Project2/adminCHE/">
                <tr><td><input type="submit" value=" Chemistry"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminPHY/">
                <tr><td><input type="submit" value="Physics"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminMAT/">
                <tr><td><input type="submit" value="Mathematics"/></td></tr>           
            </form:form>
                 <form:form method="post" action="/WebApplicationMVC_Project2/adminSTA/">
                <tr><td><input type="submit" value="Statistics"/></td></tr>           
            </form:form>
        </table>
        
    </body>
</html>
