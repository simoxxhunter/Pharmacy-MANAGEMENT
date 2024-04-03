create table Products (
	ID_product  SERIAL PRIMARY KEY,
	Product_Name VARCHAR(25) NOT NULL,
	Qte INT NOT NULL,
	Price  FLOAT NOT NULL,
	Description  VARCHAR(250) NOT NULL
);