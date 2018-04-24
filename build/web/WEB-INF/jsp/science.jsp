<%-- 
    Document   : science
    Created on : Jan 31, 2018, 12:28:02 AM
    Author     : Atif Aslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   
    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <h1 align="center">Result of Science</h1>
         <table border="1" align="center">
          
               <form:form method="post" action="/WebApplicationMVC_Project2/deptCHE/">
                <tr><td><input type="submit" value=" Chemistry"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/deptPHY/">
                <tr><td><input type="submit" value="Physics"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/deptMAT/">
                <tr><td><input type="submit" value="Mathematics"/></td></tr>           
            </form:form>
                 <form:form method="post" action="/WebApplicationMVC_Project2/deptSTA/">
                <tr><td><input type="submit" value="Statistics"/></td></tr>           
            </form:form>
        </table>
    </body>
</html>
