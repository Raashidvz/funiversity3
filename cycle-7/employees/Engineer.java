package employees;

public class Engineer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize engineer details
    public Engineer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing calculateSalary method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementing displayEmployeeDetails method
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Engineer ID: " + id);
        System.out.println("Engineer Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
