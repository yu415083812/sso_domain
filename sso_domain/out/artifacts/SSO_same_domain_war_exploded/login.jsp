<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/7/11
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <center>
        <h1>请登录</h1>
        <form action="/sso/doLogin.action" method="post">
            <span>用户名：</span><input type="text" name="username"/>
            <span>密码：</span><input type="password" name="password"/>
            <input type="hidden" name="gotoUrl" value="${gotoUrl}"/>
            <input type="submit"/>
        </form>
    </center>
</body>
</html>
