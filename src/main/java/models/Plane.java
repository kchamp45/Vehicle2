package models;


public class Plane extends Vehicle implements Drive {


    public int capacity;

    public Plane(int year, String brand, int miles, int price, int capacity) {
        super(year, brand, miles, price);
        this.capacity = capacity;
    }


//    public void accelerate() {
//        speed += 1000;
//    }

    @Override
    public void slowDown() {
        speed -= 500;
    }

    @Override
    public void stop() {

    }
}
