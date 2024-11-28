import java.util.Scanner;

// Abstract class Figure
abstract class Figure {
    double length, breadth, height;

    // Method to read data
    public void readData(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
    }

    // Abstract method to find area
    abstract double area();
}

// Derived class Rectangle
class Rectangle extends Figure {
    // Overriding area method to calculate area of rectangle
    @Override
    double area() {
        return length * breadth;
    }
}

// Derived class Triangle
class Triangle extends Figure {
    // Overriding area method to calculate area of triangle
    @Override
    double area() {
        return 0.5 * breadth * height;
    }
}

// Main class to demonstrate functionality
public class AbstractFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle instance
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter length and breadth for Rectangle:");
        double len=scanner.nextDouble();
        double breadth=scanner.nextDouble();
        rectangle.readData(len,breadth, 0);
        rectangle.displayData();
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Triangle instance
        Triangle triangle = new Triangle();
        System.out.println("Enter base and height for Triangle:");
        breadth=scanner.nextDouble();
        double height=scanner.nextDouble();
        triangle.readData(0,breadth, height);
        triangle.displayData();
        System.out.println("Area of Triangle: " + triangle.area());

        scanner.close();
    }
}
