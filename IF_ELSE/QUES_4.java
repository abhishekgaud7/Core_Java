//Write a program to input all angles of a triangle and check whether it is valid or not
package IF_ELSE;

import java.util.*;

public class QUES_4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Angles:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a+b+c;
		
		if(sum==180)
		{
			System.out.println("Triangle Is Valid");
		}
		else
		{
			System.out.println("Triangle Is Not Valid");
		}
		
		
	}
}
