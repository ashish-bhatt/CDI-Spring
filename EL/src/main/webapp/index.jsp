<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<form action="validateBean" method="GET">
<c:if test="${not empty message}">
    <h4><font color="red">${message}</font></h4>
</c:if>
Name: <input type="text" name="name"><br>
FTP URL: <input type="text" name="URL"><br>
SUBMIT: <input type="submit" name="submit URL">
</form>
</body>
</html>