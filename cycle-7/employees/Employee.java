package employees;

public abstract class Employee {
    protected String name;
    protected int id;

    // Constructor to initialize employee details
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Abstract method to display employee details
    public abstract void displayEmployeeDetails();
}
