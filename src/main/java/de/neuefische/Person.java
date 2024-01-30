package de.neuefische;
/*
Class 'Person' inputfield
Create a class 'Person' that contains properties like 'Name', 'Age', 'Gender', etc.
Implement a method that introduces the person, for example, 'Hello, I am [Name] and [Age] years old.'
Create objects of the class 'Person' for different individuals and call the introduction method.
*/

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void introduceYourself(){
        String sentence = String.format("Hallo, ich bin %s. Ich bin %d Jahre alt.", name, age);

        System.out.println(sentence);

        // alternative String
        // System.out.printf("Hello, I am %s and %d years old.", person.name, person.age);
    }

}
