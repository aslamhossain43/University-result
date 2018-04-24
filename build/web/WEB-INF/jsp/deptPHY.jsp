<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   

    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        
        <h2 align="center">Result of Physics </h2>
        <c:if test="${!empty listPhy}">
            <table border="1" align="center">

                <tr>

                    <td>Student's Id------</td>
                    <td>Student's Name------</td>
                    <td>Student's CGPA</td>
                   
                  

                </tr>
                <c:forEach items="${listPhy}" var="p">

                    <tr>

                        <td>${p.sid}</td>
                        <td>${p.name}</td>
                        <td>${p.cgpa}</td>
                        
                      
                    </tr>



                </c:forEach>


            </table>




        </c:if>


    </body>
</html>
