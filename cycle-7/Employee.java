import employees.Manager;    // Importing Manager class from employees package
import employees.Engineer;   // Importing Engineer class from employees package
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a Manager object
        System.out.println("Enter manager name");
        String name = scanner.nextLine();
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter baseSalary");
        double baseSalary = scanner.nextDouble();
        System.out.println("Enter bonus");
        double bonus = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline

        Manager manager = new Manager(name, id, baseSalary, bonus);
        manager.displayEmployeeDetails();  // Displaying manager details

        System.out.println(); // For spacing

        // Creating an Engineer object
        System.out.println("Enter engineer name");
        name = scanner.nextLine(); // Read engineer's name (consume the newline properly)
        System.out.println("Enter id");
        id = scanner.nextInt();
        System.out.println("Enter hourly rate");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter hours worked");
        int hoursWorked = scanner.nextInt();

        Engineer engineer = new Engineer(name, id, hourlyRate, hoursWorked);
        engineer.displayEmployeeDetails();  // Displaying engineer details
        scanner.close();
    }
}
