CREATE TABLE Payment (
    paymentId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    orderId INT NOT NULL,
    eventId INT NOT NULL,
    status VARCHAR(50) NOT NULL,
    totalAmount DECIMAL(15,2) NOT NULL
);

CREATE TABLE PaymentMethod (
    paymentMethodId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    paymentId INT NOT NULL,
    paymentMethod VARCHAR(50) NOT NULL,
    paymentAmount DECIMAL(15,2) NOT NULL
);

ALTER TABLE PaymentMethod ADD FOREIGN KEY (paymentId) REFERENCES Payment (paymentId);

CREATE TABLE AllowedPaymentMethod (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    brand VARCHAR(50),
    status BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO AllowedPaymentMethod VALUES (1, 'BANKSLIP', NULL, 1);
INSERT INTO AllowedPaymentMethod VALUES (2, 'CREDIT CARD', 'VISA', 1);
INSERT INTO AllowedPaymentMethod VALUES (3, 'CREDIT CARD', 'MASTER', 1);