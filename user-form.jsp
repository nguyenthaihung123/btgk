<h2>User Form</h2>
<form action="users" method="post">
    <input type="hidden" name="id" value="${user.id}">
    Username: <input type="text" name="username" value="${user.username}"/><br/>
    Password: <input type="password" name="password" value="${user.password}"/><br/>
    Role:
    <select name="role">
        <option value="USER" ${user.role == 'USER' ? 'selected' : ''}>USER</option>
        <option value="ADMIN" ${user.role == 'ADMIN' ? 'selected' : ''}>ADMIN</option>
    </select><br/>
    <button type="submit">Save</button>
</form>