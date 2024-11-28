package geometry;

public class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}