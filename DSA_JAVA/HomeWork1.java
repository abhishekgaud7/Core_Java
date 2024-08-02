package DSA_JAVA;

import java.util.Scanner;

public class HomeWork1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		
	if(choice==1)
	{
		System.out.println(a+b);
	}
	else if(choice==2)
	{
		System.out.println(a-b);
	}
	else if(choice==3)
	{
		System.out.println(a*b);
	}
	else if(choice==4)
	{
		System.out.println(a/b);
	}
	else if(choice==5)
	{
		System.out.println(a%b);
	}
	else
	{
		System.out.println("Invalid choice");
	}
		
	}
}
