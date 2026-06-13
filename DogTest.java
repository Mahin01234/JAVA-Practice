package com.mycompany.student_details;

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.dog_1_name = "Buddy";
        System.out.println("Simple Dog name: " + myDog.dog_1_name);
        System.out.println();

        Dog_details dog1 = new Dog_details("Max", "Golden Retriever", 3, "Golden");
        Dog_details dog2 = new Dog_details("Bella", "Beagle", 2, "Brown & White");

        System.out.println("Dog 1 Details:");
        dog1.display();   // make sure method name matches: display()

        System.out.println();
        System.out.println("Dog 2 Details:");
        dog2.display();
    }
}