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
	for(int i = 1; i<10; i++) {
		out.print(i+"단"+"<br/>");
		for(int j = 2; j<10; j++) {
			out.print(j + "*" + i + "=" + (i*j)+ " ");
	}
		out.print("<br/>");
}

%>

</body>
</html>