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
    
    <form action="./WEB002b.jsp" method="POST">
        お名前は？
        <input type="text" name="param" />
        <br>
        <input type="submit" value="送信" />
     </form>
     
</body>
</html>