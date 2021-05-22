<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="home" method="post">
		User Name <input type="text" name="username" value="" />
		Password <input type="password" name="password" value="" />
		<input type="submit" name="submit" value="submit" />
	</form>
	
</body>
</html>