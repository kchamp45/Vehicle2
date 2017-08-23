SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS cars {
    id int PRIMARY KEY auto_increment,
    body VARCHAR,
    model VARCHAR,
    grade VARCHAR,
    color VARCHAR,
    vehicleId INT
};

CREATE TABLE IF NOT EXISTS vehicle {
    id int PRIMARY KEY auto_increment,
    vehicleYear VARCHAR,
    brand VARCHAR,
    mileage INT,
    price INT
}