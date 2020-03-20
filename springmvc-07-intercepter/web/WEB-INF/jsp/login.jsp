<%--
  Created by IntelliJ IDEA.
  User: LDeng
  Date: 2020/3/17
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--在 web-info下的所有页面只能通过controller或者servlet去访问--%>
<h1>登录页面<h1>


    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" name="username"/>
        密码：<input type="password" name="password"/>
        <input type="submit" value="提交">



    </form>
</body>
</html>
