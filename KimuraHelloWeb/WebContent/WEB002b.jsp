<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>WEB002a</title>
</head>
<body>
<%= "JSPの基礎　問１" %>
<hr>
<%
// Servletと同じようにエンコード、値取得、標準出力をする
request.setCharacterEncoding( "Shift-JIS" );
String param = request.getParameter("param");
System.out.println(param);
%>

<%= "こんにちは　"+param+"　さん" %>
<hr>
</body>
</html>