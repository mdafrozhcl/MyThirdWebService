<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Student records</title>
</head>
<body>
	<fieldset dir="ltr" style="width: 50%;">
		<legend>Student Form</legend>
		<form action="/MyThirdWebService/StudnetDetailsConfirm.jsp">
			<table cellspacing="4" width="50%;">
				<tr>
					<th align="right" valign="middle">First Name:</th>
					<td align="left" valign="middle"><input type="text"
						name="firstName" size="10" title="only characters are accepted" pattern="^[A-Za-z]*$" placeholder="First name" autofocus required/></td>
				</tr>
				<tr>
					<th align="right" valign="middle">Last Name:</th>
					<td align="left" valign="middle"><input type="text" pattern="^[A-Za-z]*$" placeholder="Last name" required
						name="lastName" size="10" title="only characters are accepted" /></td>
				</tr>
				<tr>
					<th align="right" valign="middle">Age:</th>
					<td align="left" valign="middle"><input type="text" name="age"
						size="10" title="age must be greater than 5 years and less then 70" pattern="[0-9]{2}" placeholder="Age" required min="5" max="70" /></td>
				</tr>
				<tr>
					<th align="right" valign="middle">Gender:</th>
					<td align="left" valign="middle"><input type="radio"
						name="gender" title="male" value="male" checked="checked"/>Male<input type="radio"
						name="gender" title="female" value="female" />Female</td>
				</tr>
				<tr>
					<td colspan="2" align="center" valign="middle">
					<input type="reset" value="Reset" title="Click to Reset" /> &nbsp;
					<input type="submit" form="" value="Submit" title="Click to Submit"/>	 
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>