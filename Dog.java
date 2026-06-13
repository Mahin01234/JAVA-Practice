/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_details;

/**
 *
 * @author DELL
 */
public class Dog {
    String dog_1_name;
}

// Detailed Dog_details class
class Dog_details {
    String name;
    String breed;
    int age;
    String color;

    // Constructor
    public Dog_details(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Method to display dog details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
    }
}
