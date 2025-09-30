<h2>Danh sách User</h2>
<a href="users?action=new">Thêm User</a>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Username</th>
    <th>Role</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${list}" var="u">
    <tr>
      <td>${u.id}</td>
      <td>${u.username}</td>
      <td>${u.role}</td>
      <td>
        <a href="users?action=edit&id=${u.id}">Sửa</a>
        <a
          href="users?action=delete&id=${u.id}"
          onclick="return confirm('Xóa?')"
          >Xóa</a
        >
      </td>
    </tr>
  </c:forEach>
</table>
<div>
  <c:forEach begin="1" end="${totalPages}" var="p">
    <a href="users?page=${p}">${p}</a>
  </c:forEach>
</div>
