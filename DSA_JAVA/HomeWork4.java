package DSA_JAVA;

import java.util.Scanner;

public class HomeWork4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		        int choice;
		        int marks;
		        
		        do {
		            System.out.println("Enter 1 to input marks, 0 to stop:");
		            choice = sc.nextInt();
		            
		            if (choice == 1) {
		                System.out.println("Enter student's marks (out of 100):");
		                marks = sc.nextInt();
		                
		                if (marks >= 90) {
		                    System.out.println("This is Good");
		                } else if (marks >= 60) {
		                    System.out.println("This is also Good");
		                } else if (marks >= 0) {
		                    System.out.println("This is Good as well. Because marks don’t matter but our effort does.");
		                } else {
		                    System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
		                }
		            }
		        } while (choice != 0);
		        
		        System.out.println("Program terminated.");
		        
		}

}
