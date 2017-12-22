<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false" isELIgnored="false"%>
<html>
<head>
<title>Activity Stream</title>
</head>
<body>
	<h1 align="center">Messages Version 1.1</h1>
	<form action="sendMessage" method="Post">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="senderName"></td>
			</tr>
			<tr>
				<td>Message</td>
				<td><input type="text" name="message"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Send"></td>
			</tr>

		</table>
	</form>

<table>
<tr>
<td><b>Sender Name </b></td>
<td><b>Message </b></td>
<td><b>Posted Date </b></td>
</tr>
<c:forEach items = "${messageList}" var = "message">
<tr>
<td>${message.senderName}</td>
<td>${message.message}</td>
<td>${message.postedDate}</td>
</tr>
</c:forEach>
</table>
	<!-- create a form which will have textboxes for Sender Name and Message content along with a Send 
Submit button. Handle errors like empty fields -->



	<!-- display all existing messages in a tabular structure with Sender Name, Posted Date and Message -->

</body>
</html>