package de.neuefische;

/*
Coding: Classes and Objects

Create a class 'Car' together that represents the properties and methods of a car.

    Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc.
    Step 2: Implement a method that "starts" the car and outputs a message.
    Step 3: Create an object of the class 'Car' and call the method to start it.
    Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed.
    Step 5: Create a second object of the class 'Car', accelerate it, and display the speed.
    If you have already completed this task earlier, you may work on the bonus task on the next page.

Bonus

If you like, also work on this optional bonus task.

    Class 'Person' inputfield
    Create a class 'Person' that contains properties like 'Name', 'Age', 'Gender', etc.
    Implement a method that introduces the person, for example, 'Hello, I am [Name] and [Age] years old.'
    Create objects of the class 'Person' for different individuals and call the introduction method.

 */

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();

        Car car2 = new Car();
        car2.accelerate(50);
        System.out.println(car2.speed);

        car2.accelerate(30);
        System.out.println(car2.speed);
    }
}