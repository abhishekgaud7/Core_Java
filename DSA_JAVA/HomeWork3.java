package DSA_JAVA;

import java.util.Scanner;

public class HomeWork3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int number=sc.nextInt();
		
		for(int i=2;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
