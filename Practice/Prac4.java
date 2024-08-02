package Practice;

import java.util.*;

public class Prac4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Aadhar card: ");
        String aadhar = sc.nextLine();

        System.out.print("Enter your PAN card: ");
        String pan = sc.nextLine();
        
        double initialDeposit = 100000;

        BankAccount account = new BankAccount(name, aadhar, pan, initialDeposit);

        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Close Account");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.print("Enter your deposit amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } 
            else if (choice == 2) 
            {
                System.out.print("Enter your withdraw amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            }
            else if (choice == 3) 
            {
                account.closeAccount();
                break;
            } 
            else 
            {
                System.out.println("Invalid choice, please try again.");
            }
        }

    }
}
class BankAccount 
{
    private String name;
    private String aadhar;
    private String pan;
    private double balance;

    public BankAccount(String name, String aadhar_card, String pan_card, double initialDeposit) 
    {
        this.name = name;
        this.aadhar = aadhar_card;
        this.pan = pan_card;
        this.balance = initialDeposit;
        System.out.println("Account created successfully");
    }

    public void deposit(double amount) 
    {
        this.balance += amount;
        System.out.println("Your account balance is " + this.balance);
    }

    public void withdraw(double amount) 
    {
        if (amount > this.balance) 
        {
            System.out.println("Insufficient balance in your account");
        }
        else 
        {
            this.balance -= amount;
            System.out.println("Final balance is " + this.balance);
        }
    }

    public void closeAccount() 
    {
        System.out.println("Account closed successfully");
    }
}