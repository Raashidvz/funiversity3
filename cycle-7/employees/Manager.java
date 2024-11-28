package employees;

public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor to initialize manager details
    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementing calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implementing displayEmployeeDetails method
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager ID: " + id);
        System.out.println("Manager Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
