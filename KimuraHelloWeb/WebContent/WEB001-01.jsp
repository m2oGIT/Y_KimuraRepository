<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>WEB001-01</title>
</head>
<body>
    <form action="./WEB001-01.jsp" method="POST">
        <input type="text" name="para" />
        <input type="submit" value="���͒l" />
     </form>
     
<%
request.setCharacterEncoding( "Shift-JIS" );
String input = request.getParameter("para");
String str = request.getParameter("para");
int n = Integer.MIN_VALUE;
n = Integer.parseInt(str);
for (int i = 0; i < n; i++) {
  System.out.println(input);
}
%>

</body>
</html>