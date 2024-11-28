// File: Main.java
import geometry.Circle;      // Importing Circle class from geometry package
import geometry.Rectangle;   // Importing Rectangle class from geometry package
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Creating a Circle object
        System.out.println("Enter radius of the circle");
        double radius=scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Creating a Rectangle object
        System.out.println("Enter length and breadth of the rectangle");
        double length=scanner.nextDouble();
        double breadth=scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length,breadth);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        scanner.close();
    }
}
