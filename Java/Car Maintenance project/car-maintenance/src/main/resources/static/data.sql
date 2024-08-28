INSERT INTO car_info (customer_name, vin, model, manufacturer, discount)
VALUES('Sarah Lee', '1HGCM82633A123456', ' Accord', 'Honda', 'N/A'),
      ('William Butcher', '1J4GL58K74W123456', 'Liberty', 'Jeep', 'YES'),
      ('Avery Cooper', '3VWFE21C04M123456', 'Jetta', 'Volkswagen', 'YES');


INSERT INTO maintenance_record (vin, details, date, cost, status)
VALUES('1HGCM82633A123456', 'Vehicle
received an oil change with synthetic oil and a tire rotation, ensuring optimal engine performance and balanced wear.', '2024-08-09', '200.50', 'COMPLETE'),
('1J4GL58K74W123456','Vehicle is need of a replacement of front brake pads. Ordering parts, delivery expected by end of day.', '2024-08-11', '450.00', 'PENDING'),
('3VWFE21C04M123456', 'Vehicle  requires alignment due to uneven tire wear and pulling to the left.', '2024-08-15', '150.75', 'PENDING')