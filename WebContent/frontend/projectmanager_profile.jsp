<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manager Profile - Simply People HR Administration</title>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>

	<jsp:directive.include file="header.jsp" />
	
	<div align="center">
		<br/>
		<h2>Welcome, ${loggedManager.fullname}. This is Manager Portal</h2>
		<br/>	
		
	</div>
		
	<jsp:directive.include file="footer.jsp" />

</body>
</html>