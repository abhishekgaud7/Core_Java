//Write a program in Java to input 5 numbers from keyboard and find their sum and 
//average using for loop.  
package TopsAssignment;

import java.util.Scanner;

public class Ques5 
{
	public static void main(String[] args) 
	{
		    Scanner scanner = new Scanner(System.in);
		    int sum = 0;

		    System.out.println("Enter 5 numbers:");
		    for (int i = 1; i <= 5; i++) 
		    {
		      System.out.print("Enter number " + i + ": ");
		      sum += scanner.nextInt();
		    }

		    double average = (double) sum / 5;

		    System.out.println("Sum: " + sum);
		    System.out.println("Average: " + average);

	}
}
