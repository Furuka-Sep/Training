<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.*"%>
<%
int rand=new Random().nextInt(4);
String[] fortunes={"大吉","中吉","小吉","凶"};
String fortune=fortunes[rand];
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>あなたの運性は<%=fortune %></p>
</body>
</html>