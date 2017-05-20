<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<%@page import="entity.EmployeeEntity" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>はじめてのJCP</title>
</head>
<body>
    <h1><font color="blue">はじめてのJSPです。</font></h1>
    
    <form action="./EchoJSP.jsp" method="POST">
        <input type="text" name="param" />
        <input type="submit" value="自ページに送信！" />
     </form>
<!-- HTMLのコメントは画面のソースに出力される -->
<%-- JSPのコメントは出力されない --%>
<%
// Servletと同じようにエンコード、値取得、標準出力をする
request.setCharacterEncoding( "Shift-JIS" );
String param = request.getParameter("param");
System.out.println(param);
%>

<%= param %>

<hr>
    ループによる列の出力
    <table border="1" bordercolor="black">
    <tr>
    <% for (int i = 0; i < 10; i++) { %>
      
      <td><%= i %></td>
      
    <% } %>
    </tr>
    </table>

<hr>
    現在の日時を表示<br>
    <%
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
    Date now = new Date();
    %>

<%= fmt.format(now) %>

<hr>
    ForwardServletから受信した値<br>
<%
    // ForwardServletで設定した値を取得
    // String name = (String) request.getAttribute("name");
    // Integer age = (Integer) request.getAttribute("age");

    EmployeeEntity entity = (EmployeeEntity) request.getAttribute("entity");
%>

<%= entity.getNo() %><br>
<%= entity.getName() %><br>
<%= entity.getAge() %>

</body>
</html>