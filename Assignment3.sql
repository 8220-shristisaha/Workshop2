create table customers(
	customer_id serial primary key,
	first_name Varchar(12),
	last_name Varchar(12),
	email Varchar(25)
);

create table orders(
	order_id serial primary key,
	customer_id int,
	order_date date,
	total_amount double precision,
	constraint fk_customer_id
	foreign key (customer_id)
	references customers(customer_id)
);

create table products(
	product_id serial primary key,
	product_name Varchar(20),
	price double precision
);

create table order_items(
	order_item_id serial primary key,
	order_id int,
	product_id int,
	quantity int,
	constraint fk_orders
	foreign key (order_id)
	references orders(order_id),
	constraint fk_products
	foreign key (product_id)
	references products(product_id)
);

create table categories(
	category_id serial primary key,
	category_name Varchar(20)
);



 --------------------Values added 


Insert into products(product_name,price,category_id) values
	('Yatch','120000',2),
	('Titanic','1040000',2),
	('Sub-marine','850000',1);

Insert into categories(category_name) values
	('under-water'),
	('on-water');


------------------Task - 3 :

ALTER TABLE products
add column category_id int;

ALTER TABLE products
add constraint fk_category_id
	foreign key (category_id)
	references categories(category_id);

select pr.product_name,pr.price,ca.category_name
from products as pr
Inner Join categories as ca
On pr.category_id = ca.category_id;







