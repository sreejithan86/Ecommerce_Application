CREATE USER 'ecommerceapp'@'Localhost' IDENTIFIED BY 'ecommerceapp';
GRANT ALL PRIVILEGES ON *.* TO 'ecommerceapp'@'Localhost';
FlUSH PRIVILEGES;
ALTER USER 'ecommerceapp'@'Localhost' IDENTIFIED WITH mysql_native_password BY 'ecommerceapp';