<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
public int calc1(int year, int current) {
	return current-year+1;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
try {
	int year = Integer.parseInt(request.getParameter("year"));
	out.println(year + "년에 태어난 당신은");
	int current = LocalDate.now().getYear();
	out.println(current + "년 올해 한국 나이로" + " " + calc1(year,current) + "살이고");
}
catch (Exception e) {
	out.println("예외 발생 : 매개변수 year가 null입니다.");
}
%>
</body>
</html>