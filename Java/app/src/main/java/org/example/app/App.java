package org.example.app;

import org.example.dogs.Dog; // Import Dog class from the dogs library

public class App {
    public static void main(String[] args) {
        // Creating a new Dog instance
        Dog myDog = new Dog("Buddy", 4);
        System.out.println(myDog.bark()); // This should output "Woof!"
        System.out.println("My dog's name is " + myDog.getName() + " and he is " + myDog.getAge() + " years old.");
    }
}