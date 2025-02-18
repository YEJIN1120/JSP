<%@ page import="java.sql.Statement"%>
<%@ page import="common.JDBCConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board 목록 출력</title>
</head>
<body>
	<%
	JDBCConnect jdbc = new JDBCConnect();
	
	String sql = "select num, title, name, postdate, visitcount from member , board where name = '머스트해브'";
	Statement stmt = jdbc.con.createStatement();

	int inResult = stmt.executeQuery(sql);
	
	while (rs.next())
		int num = rs.getint(num);
		String title = rs.getString("title");
		String name = rs.getString("name");
		String postdate = rs.getString("postdate");
		String visitcount = rs.getString("visitcount");
		
		out.println();
	
	
	%>
</body>
</html>