// File: Main.java
import math.Calculator; // Importing the Calculator class from the math package

public class CalculatorMain {
    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Performing arithmetic operations
        double a = 10;
        double b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
