<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <%@ page
import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="vi">
  <head>
    <meta charset="UTF-8" />
    <title>Trang chủ</title>
  </head>
  <body>
    <% HttpSession sessionUser = request.getSession(false); String username =
    null; if (sessionUser != null) { username = (String)
    sessionUser.getAttribute("user"); } if (username == null) {
    response.sendRedirect("login.jsp"); return; } %>

    <h2>Xin chào, <%= username %>!</h2>
    <p>Bạn đã đăng nhập thành công.</p>

    <form action="logout" method="post">
      <button type="submit">Đăng xuất</button>
    </form>
  </body>
</html>
