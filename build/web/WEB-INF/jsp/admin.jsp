<%-- 
    Document   : admin
    Created on : Jan 31, 2018, 1:08:05 AM
    Author     : Atif Aslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   
    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <h1 align="center">ADMIN</h1>
        
         <table border="1" align="center">
          
               <form:form method="post" action="/WebApplicationMVC_Project2/agriculture/">
                <tr><td><input type="submit" value=" Agriculture"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/admin/addCSE">
                <tr><td><input type="submit" value="Computer Science & Engineering"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminFIS/">
                <tr><td><input type="submit" value="Fisheries"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/adminDVM/">
                <tr><td><input type="submit" value="Vaterinary & Animal Sciences"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/admin/addBBA">
                <tr><td><input type="submit" value="Business Studies"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/admin/addEng">
                <tr><td><input type="submit" value="Engineering"/></td></tr>           
            </form:form>
                  <form:form method="post" action="/WebApplicationMVC_Project2/admin/addScience">
                <tr><td><input type="submit" value="Science"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/admin/addSSL">
                <tr><td><input type="submit" value="Social Science & Humanities"/></td></tr>           
            </form:form>
             
     
        </table>
       
        
    </body>
</html>
