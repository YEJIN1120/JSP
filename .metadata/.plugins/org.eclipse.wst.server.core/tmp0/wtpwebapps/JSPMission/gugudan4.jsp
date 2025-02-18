<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s = request.getParameter("val");
int val = 3;
if (s!= null)
	val = Integer.parseInt(s);
	
out print  %>
</body>
</html>