// Write a Java program that takes a year from user and print whether that year is a leap 
//year or not.
package TopsAssignment;

import java.util.Scanner;

public class Ques3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year= sc.nextInt();
		
		if(year%400==0)
		{
			System.out.println("This is a Leap Year");
			
		}
		else if(year%100==0)
		{
			System.out.println("This is not a Leap Year");
		}
		else if(year%4==0)
		{
			System.out.println("This is a Leap Year");
		}
		else
		{
			System.out.println("This is not a Leap year");
		}
	}
}
