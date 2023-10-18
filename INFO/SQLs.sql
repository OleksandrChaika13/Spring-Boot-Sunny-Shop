
CREATE DATABASE demo_db;


CREATE TABLE IF NOT EXISTS fruits
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS vegetables
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  article VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS orders
( id INTEGER NOT NULL AUTO_INCREMENT,
  order_code VARCHAR(255) NOT NULL,
  buyer_name VARCHAR(255) NOT NULL,
  buyer_phone VARCHAR(255) NOT NULL,
  buyer_email VARCHAR(255) NOT NULL,
  content VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
 fruits (img, name, article, description, price)
VALUES
 ('apple.jpg', 'Apple', 'UIO1234', 'Gala Apple', 2.83),
 ('banana.jpg', 'Banana', 'UI01235', 'Cavendish Banana', 3.15),
 ('lemon.jpg', 'Lemon', 'UI01236', 'Lisbon Lemon', 3.35),
 ('lime.jpg', 'Lime', 'UIG01237', 'Lime "Tahitian', 3.95),
 ('orange.jpg', 'Orange', 'UI01238', 'Valencia Orange', 3.71);


INSERT INTO
 vegetables (img, name, article, description, price)
VALUES
 ('cucumber.jpg', 'Cucumber', 'UI14500', 'English Cucumber', 2.95),
 ('onion.jpg', 'Onion', 'UI14501', 'Yellow Onion', 1.99),
 ('pepper.jpg', 'Bell Pepper', 'UI14502', 'Yellow/Red varieties', 2.50),
 ('potato.jpg', 'Potato', 'UI14503', 'Russet Potato', 1.99),
 ('tomato.jpg', 'Tomato', 'UI14504', 'Beefsteak Tomato', 2.75);