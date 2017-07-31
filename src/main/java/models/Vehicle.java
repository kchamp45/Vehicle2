package models;

/**
 * Created by Guest on 7/31/17.
 */
public class Vehicle {
    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

        public boolean worthBuying(int maxPrice){
            return (price < maxPrice);
        }
}
