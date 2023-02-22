<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<form action="hello-servlet" method="get">
    <input type="text" name="num" value=""/>
    <input type="submit" name="sub" value="push"/>
</form>
</body>
</html>