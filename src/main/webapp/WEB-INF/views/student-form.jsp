<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cdac.training.studentsoft.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration - CDAC Banglore</title>
<link rel="stylesheet" href="/student-management/resources/static/css/student.css">
</head>
<body>
	<h1 style="color:Black;text-align:center;">CDAC Banglore - Student Admission Form</h1>
	
	<h2>Add New Student</h2>
	<%
			Student student = (Student) request.getAttribute("student");
	%>
	
	<form action="/student-management/students" method="post">
		 <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="${student.firstName}" required /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" value="${student.lastName}" required /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" name="gender" value="Male" ${student.gender == 'Male' ? 'checked' : ''} required /> Male
                    <input type="radio" name="gender" value="Female" ${student.gender == 'Female' ? 'checked' : ''} required /> Female
                </td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" value="${student.course}" required /></td>
            </tr>
            <tr>
                <td colspan="2">
                <input type="submit" value="Save">
              
               <a href="/student-management/">Cancel</a>
	 			</td>
            </tr>
        </table>
	</form>
	
	 <%
        // Redirect to success.jsp after form submission
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            // Assuming successful processing of the form
            response.sendRedirect("Success.jsp");
        }
    %>
</body>
</html>