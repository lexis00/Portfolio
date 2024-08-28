-- Initializing a database and adding tables
CREATE DATABASE Maintenance;
USE Maintenance;

CREATE TABLE car_info (
    vin CHAR(17) NOT NULL PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    model VARCHAR(100) NOT NULL,
    manufacturer VARCHAR(100) NOT NULL,  
    discount VARCHAR(10)
);

CREATE TABLE maintenance_record (
    car_vin CHAR(17),
    FOREIGN KEY (car_vin) REFERENCES car_info(vin),
    details TEXT(500),
    date DATE,
    cost DECIMAL(10,2),
    status VARCHAR(10)
);

