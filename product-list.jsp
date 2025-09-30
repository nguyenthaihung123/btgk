<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<h2>Danh sách sản phẩm theo Seller</h2>

<c:forEach var="p" items="${products}">
    <div style="border:1px solid #ccc; padding:10px; margin:10px;">
        <p><b>Mã cửa hàng:</b> ${p.sellerId}</p>
        <img src="${p.imageLink}" width="120"><br>
        <p><b>Tên sản phẩm:</b> 
            <a href="product-detail?id=${p.id}">${p.name}</a>
        </p>
        <p><b>Mã sản phẩm:</b> ${p.id}</p>
        <p><b>Danh mục:</b> ${p.category}</p>
        <p><b>Giá:</b> ${p.price}</p>
        <p><b>Amount:</b> ${p.amount}</p>
    </div>
</c:forEach>
</body>
</html>
