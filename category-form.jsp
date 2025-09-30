<h2>Category Form</h2>
<form action="categories" method="post">
  <input type="hidden" name="id" value="${category.id}" />
  Name: <input type="text" name="name" value="${category.name}" /><br />
  <button type="submit">Save</button>
</form>
