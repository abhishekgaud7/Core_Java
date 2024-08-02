//Write a Java program to Take three numbers from the user and print the greatest number.
package TopsAssignment;

import java.util.Scanner;

public class Ques1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter All Three Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is bigger");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}
		
	}
}
