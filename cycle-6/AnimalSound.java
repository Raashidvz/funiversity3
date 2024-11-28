// Create a class Animal with the following fields String name, int age. Add a method 
// makeSound() that returns "Animal sound". Create a subclass Dog that extends Animal and 
// adds a field String breed.Override makeSound() in Dog to return "Bark". In the main method, 
// create an instance of Dog, set its fields, and call makeSound().
import java.util.*;
class Animal {
    String name;
    int age;

    public String makeSound() {
        return "Animal sound";
    }
}

class Dog extends Animal {
    String breed;

    public String makeSound() {
        return "Bark";
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Dog myDog = new Dog();

        //set values
        System.out.println("Enter dog name :");
        myDog.name=s.next();
        System.out.println("Enter dog age :");
        myDog.age=s.nextInt();
        System.out.println("Enter dog breed :");
        myDog.breed=s.next();

        // Setting fields and calling makeSound()
        System.out.println("Dog Name: " + myDog.name);
        System.out.println("Dog Age: " + myDog.age);
        System.out.println("Dog Breed: " + myDog.breed);
        System.out.println("Dog Sound: " + myDog.makeSound());

        s.close();
    }
}
