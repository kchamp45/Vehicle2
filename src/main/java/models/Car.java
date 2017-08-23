package models;
import dao.CarDao;
import models.Vehicle;

import java.util.ArrayList;


public class Car extends Vehicle implements CarDao, Drive {
    private String body;
    private String model;
    private String grade;
    private String color;
//    private int vehicleId;

    public Car (int year, String brand, int mileage, int price, String body, String model, String grade, String color ) {
        super(year, brand, mileage, price);
        this.body = body;
        this.model = model;
        this.grade = grade;
        this.color = color;
//        this.vehicleId = vehicleId;
    }
    @Override
    public ArrayList<String> returnAmazingColors() {
        ArrayList<String> colors = new ArrayList<>();

        return colors;
    }
    @Override
    public ArrayList<String> returnNewerCar() {
        ArrayList<String> newbies = new ArrayList<>();
        return newbies;
    }

//    @Override
//    public void accelerate() {
//        speed += 10;
//    }

    @Override
    public void slowDown() {
        speed -= 5;
    }

    @Override
    public void stop() {
        speed = 0;

        _explodecar();
    }

    private void _explodecar() {

    }
}
