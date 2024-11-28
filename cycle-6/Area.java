// Create a base class Shape with the field String color and the method getColor(). Implement 
// two subclasses: Circle with field double radius. Rectangle with fields double length and 
// double width. Each subclass should have a method to calculate its area. In the main method, 
// create instances of both subclasses, set their fields, and display their area and color

import java.util.*;
class Shape {
    String color;

    public String getColor() {
        return color;
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Enter color for circle ");
        circle.color=s.next();

        System.out.println("Enter radius of circle ");
        circle.radius=s.nextDouble();

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.calculateArea());

        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter color for rectangle ");
        rectangle.color=s.next();

        System.out.println("Enter length of rectangle ");
        rectangle.length=s.nextDouble();

        System.out.println("Enter width of rectangle ");
        rectangle.width=s.nextDouble();

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        s.close();
    }
}
