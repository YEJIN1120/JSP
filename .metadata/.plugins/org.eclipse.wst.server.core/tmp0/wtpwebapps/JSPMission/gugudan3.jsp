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
// localhost:8080/JSPMission/gugudan3.jsp?val=3
String s = request.getParameter("val");
int val = 2;
if (s != null)
	val = Integer.parseInt(s);

out.print("<h2>"+val+"단</h2>");
for(int j = 1; j<10; j++) {
	out.print(val + "*" + j + "=" + (val*j)+"<br/>");
}
%>
</body>
</html>