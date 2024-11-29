<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="/login.jsp" method="get">
    <input name="" placeholder="name">
    <input name="password" placeholder="password">
    <button>Submit</button>
</form>

<a href="hello-servlet">Hello Servlet</a>
<a href="index">Time</a>
</body>
</html>