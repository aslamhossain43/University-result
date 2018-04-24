<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  

    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <h3 align="center">Hajee Mohammad Danesh Science & Technology University</h3>
        
        <h3 align="center"> Result of all Faculties.</h3>
        <table border="1" align="center">
          
               <form:form method="post" action="/WebApplicationMVC_Project2/agResult/">
                <tr><td><input type="submit" value=" Agriculture"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/cse">
                <tr><td><input type="submit" value="Computer Science & Engineering"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/deptFIS/">
                <tr><td><input type="submit" value="Fisheries"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/deptDVM/">
                <tr><td><input type="submit" value="Vaterinary & Animal Sciences"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/bba">
                <tr><td><input type="submit" value="Business Studies"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/eng">
                <tr><td><input type="submit" value="Engineering"/></td></tr>           
            </form:form>
                  <form:form method="post" action="/WebApplicationMVC_Project2/science">
                <tr><td><input type="submit" value="Science"/></td></tr>           
            </form:form>
               <form:form method="post" action="/WebApplicationMVC_Project2/ssl">
                <tr><td><input type="submit" value="Social Science & Humanities"/></td></tr>           
            </form:form>
              <form:form method="post" action="/WebApplicationMVC_Project2/admin/">
                <tr><td><input type="submit" value="ADMIN"/></td></tr>           
            </form:form>
             
            
            
            
            
        </table>
       
    </body>
</html>
