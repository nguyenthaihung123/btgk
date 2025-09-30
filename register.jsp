<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
  <head>
    <meta charset="UTF-8" />
    <title>Đăng ký</title>
  </head>
  <body>
    <h2>Đăng ký tài khoản</h2>
    <form action="${pageContext.request.contextPath}/register" method="post">
      <input type="text" name="username" placeholder="Tên đăng nhập" required />
      <input type="password" name="password" placeholder="Mật khẩu" required />
      <input
        type="password"
        name="confirm"
        placeholder="Xác nhận mật khẩu"
        required
      />
      <button type="submit">Đăng ký</button>
      <p style="color: red">
        <%= request.getAttribute("msg") == null ? "" :
        request.getAttribute("msg") %>
      </p>
      <a href="login.jsp">Đăng nhập</a>
    </form>
  </body>
</html>
