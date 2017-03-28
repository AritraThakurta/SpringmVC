<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<body>
	    <form:errors path="student.*" />
		<h1> Student Admission For Engineering Class</h1>
		<form action="/SpringMVCNew/submitAdmissionForm" method="post">
		   <table>
		       <tr>
		       		<td>Student's name</td>
		       		<td><input type="text" name="studentName" /></td>
		   	   </tr>
		   	   <tr>
		   	   		<td>Student's Roll no :</td>
		       		<td><input type="text" name="studentRoll" /></td>
		   	   </tr>
		   	   <tr>
		   	   		<td>Student's DOB</td>
		       		<td><input type="text" name="studentDOB" /></td>
		   	   </tr>
		   	   <tr>
		   	   		<td>Student's Skills :</td>
		       		<td><select name="studentSkills" multiple="multiple">
				<option value="Core Java">Core java</option>
				<option value="J2EE">J2EE</option>
			</select></td>
		   	   </tr>
		   </table>
		
			
			
			<input type= "submit" value="Submit this form by clicking here"/>
			
		</form>	
	</body>
</html>