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
<%= "JSP�̊�b�@��P" %>
<hr>
<%
// Servlet�Ɠ����悤�ɃG���R�[�h�A�l�擾�A�W���o�͂�����
request.setCharacterEncoding( "Shift-JIS" );
String param = request.getParameter("param");
System.out.println(param);
%>

<%= "����ɂ��́@"+param+"�@����" %>
<hr>
</body>
</html>