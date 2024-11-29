<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 29/11/24
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach khach hang</h1>
<table border="1px">
    <tr>
        <th>name</th>
        <th>phone</th>
        <th>email</th>
        <th>action</th>
    </tr>
    <c:forEach var="customer" items="${ds}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.phone}</td>
            <td>${customer.email}</td>
            <td><button>Edit</button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
