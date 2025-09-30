<h2>Danh sách Category</h2>
<a href="categories?action=new">Thêm mới</a>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${list}" var="c">
    <tr>
      <td>${c.id}</td>
      <td>${c.name}</td>
      <td>
        <a href="categories?action=edit&id=${c.id}">Sửa</a>
        <a
          href="categories?action=delete&id=${c.id}"
          onclick="return confirm('Xóa?')"
          >Xóa</a
        >
      </td>
    </tr>
  </c:forEach>
</table>

<div>
  <c:forEach begin="1" end="${totalPages}" var="p">
    <a href="categories?page=${p}">${p}</a>
  </c:forEach>
</div>
