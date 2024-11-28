// Define two interfaces:
// Vehicle with the following methods: void start(),void stop()
// Maintenance with the following method: void scheduleMaintenance()
// Create a class Car that implements both interfaces and includes the following fields: String 
// model, int year, boolean isRunning
// Implement the methods from both interfaces in the Car class: start() should print "The car is 
// starting."stop() should print "The car has stopped." scheduleMaintenance() should print 
// "Maintenance scheduled for the car."
// In the main method, create an instance of Car, set its fields, call each method, and display the 
// car's information.

import java.util.*;
interface Vehicle {
    void start();  
    void stop();   
}

interface Maintenance {
    void scheduleMaintenance();  
}

class Car implements Vehicle, Maintenance {
    String model;
    int year;
    boolean isRunning;

    
    public void start() {
        if (isRunning) {
            System.out.println("The car is already running.");
        } else {
            System.out.println("The car is starting.");
        }
    }

   
    public void stop() {
        if (isRunning) {
            System.out.println("The car is going to stop.");
        } else {
            System.out.println("The car has stopped.");
        }
    }

   
    public void scheduleMaintenance() {
        System.out.println("Maintenance scheduled for the car.");
    }

    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Is Running: " + (isRunning ? "Yes" : "No"));
    }
}

public class VehicleInfo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Car myCar = new Car();

        System.out.println("Enter car model ");
        myCar.model=s.nextLine();

        System.out.println("Enter year ");
        myCar.year=s.nextInt();

        System.out.println("Is car running (1 for yes and 0 for no)");
        int status=s.nextInt();

        if(status==1){
            myCar.isRunning=true;
        }else{
            myCar.isRunning=false;
        }

        // Display car information
        myCar.displayCarInfo();

        // Call the start method
        myCar.start();

        // Call the stop method
        myCar.stop();

        // Schedule maintenance
        myCar.scheduleMaintenance();

        s.close();
    }
}
