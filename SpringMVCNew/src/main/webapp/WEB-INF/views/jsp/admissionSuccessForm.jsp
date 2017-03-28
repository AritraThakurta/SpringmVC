<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
pageEncoding="ISO-8859-1"%>
<html>
	<body>
		<h1>${msg}</h1>
		<h2>Details are ::</h2>	
		<table border="1">
			<tr>
				<td>Student name</td>
				<td>${student.studentName}</td>
			</tr>
			<tr>
				<td>Student Roll</td>
				<td>${student.studentRoll}</td>
			</tr>
			<tr>
				<td>Student DOB</td>
				<td>${student.studentDOB}</td>
			</tr>
			<tr>
				<td>Student Skills</td>
				<td>${student.studentSkills}</td>
			</tr>	
		</table>
	</body>
</html>