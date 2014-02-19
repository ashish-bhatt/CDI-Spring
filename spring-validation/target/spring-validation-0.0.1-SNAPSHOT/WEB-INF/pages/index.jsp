<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Index</title>
</head>
<body>
<form:form commandName="connection" action="indexValidate">
Name: <form:input type="text" path="name"/> <form:errors path="name" cssClass="error" /><br>
FTP URL: <form:input type="text" path="ftpServerURL"/> <form:errors path="ftpServerURL" cssClass="error" /><br>
SUBMIT: <input type="submit" name="submit URL"/>
</form:form>
</body>
</html>