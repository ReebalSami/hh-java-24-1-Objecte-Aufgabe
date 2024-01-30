package de.neuefische;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;

    float speed;


        public Car(String brand, String model, String color, int yearOfManufacture ) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.yearOfManufacture = yearOfManufacture;
        }




    void startEngine(){
        System.out.println("car started!!!");
    }

    void accelerate(float speed){
        this.speed += speed;
    }
}
