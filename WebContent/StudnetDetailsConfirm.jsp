<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="student" class="com.afroz.third.Student"
	scope="session" />
<jsp:setProperty property="*" name="student" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<form action="/MyThirdWebService/StudnetDetails">
		<table border="1" width="50%;" align="center">
			<caption align="top">Student Details</caption>
			<tr>
				<th align="right" valign="middle">First Name:</th>
				<td align="left" valign="middle"><jsp:getProperty
						name="student" property="firstName" /></td>
			</tr>
			<tr>
				<th align="right" valign="middle">Last Name:</th>
				<td align="left" valign="middle"><jsp:getProperty
						name="student" property="lastName" /></td>
			</tr>
			<tr>
				<th align="right" valign="middle">Age:</th>
				<td align="left" valign="middle"><jsp:getProperty
						name="student" property="age" /></td>
			</tr>
			<tr>
				<th align="right" valign="middle">Gender:</th>
				<td align="left" valign="middle"><jsp:getProperty
						name="student" property="gender" /></td>
			</tr>
			<tr>
				<th align="center" valign="middle" colspan="2"><input
					type="submit" value="Submit" /></th>
			</tr>
		</table>
	</form>
</body>
</html>