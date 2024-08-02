//Write a program in Java to display the first 10 natural numbers 
//using while loop.  
package TopsAssignment;

import java.util.Scanner;

public class Ques4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		 int i=1;
		 while(i<=n)
		 {
			 System.out.println(i);
			 i++;
		 }
	}
}
