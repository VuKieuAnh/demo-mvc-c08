<%@ page import="com.example.servertime2.model.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 28/11/24
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<%
    List<Customer> customerList  = new ArrayList<>();
    customerList.add(new Customer(1, "tri", "65462", "hasg@gmail.com"));
    customerList.add(new Customer(2, "tri 2", "65462", "hasg@gmail.com"));
    customerList.add(new Customer(3, "tri 3", "65462", "hasg@gmail.com"));
    request.setAttribute("list", customerList);
%>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach khach hang</h1>
<table border="1px">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>phone</th>
        <th>email</th>
    </tr>
    <tbody>
    <c:forEach var="customer" items="${list}">
        <tr>
            <td>${customer.getId()}</td>
            <td>${customer.name}</td>
            <td>${customer.phone}</td>
            <td>${customer.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
