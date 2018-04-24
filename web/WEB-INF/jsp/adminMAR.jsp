

<%-- 
    Document   : deptCSE
    Created on : Jan 31, 2018, 9:40:03 AM
    Author     : Atif Aslam
--%>


<html><%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <script>
            
            function deleteMar(pid){
                if(confirm('Do you want to delete this Document ?'))
                {
                    var url='delete/'+pid;
                    window.location.href=url;
                }
            }
        </script>
    </head>

    <body style="background-color:greenyellow; margin-top: 0px;margin-left: 0px;">
        <c:url var="action" value="/adminMAR/mar/add"></c:url>
        <form:form method="post" action="${action}" commandName="mar">

            <table border="1" align="center">
                <c:if test="${!empty mar.name}">

                <tr><td>
                        <form:label path="id">

                            <spring:message code="label.id"/>
                        </form:label>
                    </td>

                    <td>
                        <form:input path="id"/>
                    </td>

                </tr>
                  </c:if>

                 <tr><td>
                        <form:label path="sid">

                            <spring:message code="label.sid"/>
                        </form:label>
                    </td>

                    <td>
                        <form:input path="sid"/>
                    </td>

                </tr>
                
                <tr><td>
                        <form:label path="name">

                            <spring:message code="label.name"/>
                        </form:label>
                    </td>

                    <td>
                        <form:input path="name"/>
                    </td>

                </tr>

                <tr><td>
                        <form:label path="cgpa">

                            <spring:message code="label.cgpa"/>
                        </form:label>
                    </td>

                    <td>
                        <form:input path="cgpa"/>
                    </td>

                </tr>

               



                <tr><td colspan="2">
                        <c:if test="${!empty mar.name}">
                            <input type="submit" value="<spring:message code="label.edit"/>"/>
                        </c:if>
                        <c:if test="${empty mar.name}">
                            <input type="submit" value="<spring:message code="label.addMore"/>"/>
                        </c:if>
                    </td>

                </tr>

            </table>

        </form:form>
        <h2 align="center">Result of Marketing </h2>
        <c:if test="${!empty listMar}">
            <table border="1" align="center">

                <tr>

                    <td>Student's Id------</td>
                    <td>Student's Name------</td>
                    <td>Student's CGPA------</td>
                   
                    <td>Action</td>

                </tr>
                <c:forEach items="${listMar}" var="p">

                    <tr>

                        <td>${p.sid}</td>
                        <td>${p.name}</td>
                        <td>${p.cgpa}</td>
                        
                        <td><a href="/WebApplicationMVC_Project2/adminMAR/edit/${p.id}">Edit</a>
                           <a href="%" onclick="javascript:deleteMar(${p.id})">Delete</a>
                        
                        </td>

                    </tr>



                </c:forEach>


            </table>




        </c:if>


    </body>
</html>

   