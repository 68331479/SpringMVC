<%--
  Created by IntelliJ IDEA.
  User: LDeng
  Date: 2020/3/17
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> 首页</h1>
<span>${username}</span>

    <p>
        <a href="${pageContext.request.contextPath}/logout">注销</a>
    </p>

</body>
</html>
