CREATE TABLE UserRoles (
    roleId INT PRIMARY KEY AUTO_INCREMENT,
    roleName NVARCHAR(50) NOT NULL
);
CREATE TABLE Seller (
    sellerId INT PRIMARY KEY AUTO_INCREMENT,
    sellerName NVARCHAR(100) NOT NULL,
    images NVARCHAR(255),
    status TINYINT
);
CREATE TABLE Users (
    userId INT PRIMARY KEY AUTO_INCREMENT,
    username NVARCHAR(50) NOT NULL,
    email NVARCHAR(100),
    fullname NVARCHAR(100),
    password NVARCHAR(100) NOT NULL,
    images NVARCHAR(255),
    phone NVARCHAR(20),
    status TINYINT,
    code NVARCHAR(50),
    roleId INT,
    sellerId INT,
    FOREIGN KEY (roleId) REFERENCES UserRoles(roleId),
    FOREIGN KEY (sellerId) REFERENCES Seller(sellerId)
);
CREATE TABLE Category (
    categoryId INT PRIMARY KEY AUTO_INCREMENT,
    categoryName NVARCHAR(100) NOT NULL,
    images NVARCHAR(255),
    status TINYINT
);
CREATE TABLE Product (
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName NVARCHAR(100) NOT NULL,
    productCode NVARCHAR(50),
    categoryId INT,
    description TEXT,
    price DECIMAL(10,2),
    amount INT,
    stock INT,
    images NVARCHAR(255),
    wishlist INT,
    status TINYINT,
    createDate DATETIME,
    sellerId INT,
    FOREIGN KEY (categoryId) REFERENCES Category(categoryId),
    FOREIGN KEY (sellerId) REFERENCES Seller(sellerId)
);
CREATE TABLE Cart (
    cartId INT PRIMARY KEY AUTO_INCREMENT,
    userId INT,
    buyDate DATETIME,
    status TINYINT,
    FOREIGN KEY (userId) REFERENCES Users(userId)
);
CREATE TABLE CartItem (
    cartItemId INT PRIMARY KEY AUTO_INCREMENT,
    quantity INT,
    unitPrice DECIMAL(10,2),
    productId INT,
    cartId INT,
    FOREIGN KEY (productId) REFERENCES Product(productId),
    FOREIGN KEY (cartId) REFERENCES Cart(cartId)
);
