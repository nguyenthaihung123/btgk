<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Quên Mật Khẩu</title>
  </head>
  <body>
    <h2>Đặt lại mật khẩu</h2>
    <form action="${pageContext.request.contextPath}/forgot" method="post">
      <input type="text" name="username" placeholder="Tên đăng nhập" required />
      <input
        type="password"
        name="password"
        placeholder="Mật khẩu mới"
        required
      />
      <input
        type="password"
        name="confirm"
        placeholder="Xác nhận mật khẩu mới"
        required
      />
      <button type="submit">Xác nhận</button>
      <p style="color: red">
        <%= request.getAttribute("msg") == null ? "" :
        request.getAttribute("msg") %>
      </p>
      <a href="login.jsp">Quay lại Đăng nhập</a>
    </form>
  </body>
</html>
