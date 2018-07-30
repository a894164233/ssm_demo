<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  ~ Copyright (c) 2018.
  ~ author: baitao
  --%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>test page${helloWorld}</h1>
<form action="testForm.do" method="post">
    <input type="text" name="name" value="test form">
    <input type="text" name="msg" value="test from">
    <button>submit</button>
</form>
</body>
</html>
