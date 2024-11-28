package geometry;

public class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
