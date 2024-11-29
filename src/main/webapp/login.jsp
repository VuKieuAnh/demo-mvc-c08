<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 28/11/24
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--viet truc tiep ma java vao trong jsp--%>
<%--jsp cong --%>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String[] a = {"loc", "dung", "thang"};
%>
<%
    for (int i = 0; i < a.length; i++) {
%>
<%= a[i] %>
<%
    }
%>
<h2>Chao mung ban den voi he thong</h2>
</body>
</html>
