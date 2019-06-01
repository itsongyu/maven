<%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 2019/4/4
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>hello,web!!!</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/user/login.do">
      <h1 align="cent">这是登陆界面</h1>
      <input type="text" value="姓名" name="tname"><br/>
      <input type="text" value="密码" name="pwd"><br/>
      <input type="text" value="ID" name="id"><br/>
      <input type="submit" value="登陆"><br/>
  </form>

  </body>
</html>
