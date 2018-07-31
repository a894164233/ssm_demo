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
<h1>test page</h1>
<h1>out exception 123${helloWorld}</h1>
<div>
    <label>helloWorld value:</label>
    <input type="text" placeholder="test" value="${helloWorld}" />
</div>
</body>
</html>
