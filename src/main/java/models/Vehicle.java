package models;

public class Vehicle {
    public int year;
    public String brand;
    public int miles;
    public int price;
    public int speed;

    public Vehicle(int year, String brand, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.miles = miles;
        this.price = price;
    }

    public void accelerate() {
        speed += 893;
    }


}
