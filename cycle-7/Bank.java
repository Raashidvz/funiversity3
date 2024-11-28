// File: Bank.java
import bank.Account;  // Importing the Account class from the bank package
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean bool=true;
        // Creating an account with an initial balance
        System.out.println("Enter account holder name");
        String name= scanner.nextLine();
        System.out.println("Enter initial Deposit");
        double initialDeposit=scanner.nextDouble();
        Account account1 = new Account(name, initialDeposit);
        
        while(bool){
            System.out.println("BANK");
            System.out.println("1. Display balance");
            System.out.println("2. Deposit fund");
            System.out.println("3. Withdraw money");
            System.out.println("0. EXIT");

            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    account1.displayBalance();
                    break;
                case 2:
                    System.out.println("Enter fund to deposit");
                    double deposit=scanner.nextDouble();
                    account1.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter fund to withdraw");
                    double withdraw=scanner.nextDouble();
                    account1.withdraw(withdraw);
                    break;
                case 0:
                    System.out.println("Exiting....");
                    bool =false;
                    break;
                default:
                    System.out.println("Wrong input");

            }
        }
        scanner.close();
    }
}
