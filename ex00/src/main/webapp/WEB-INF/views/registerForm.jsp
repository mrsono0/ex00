<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Input Data</h1>

	<P>The time on the server is ${serverTime}.</P>

	<form action="/i" method="post">
		Name : <input type="text" name="name" value="hongkd"><br>
		gender: <input type="text" name="gender" value="1234"><br>
		email: <input type="text" name="email" value="hongkd@good.io"><br> 
		birthYear: <input type="text" name="birthYear" value="2000"><br> 
		<input type="submit" value="register">
	</form>
</body>
</html>
