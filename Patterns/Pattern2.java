package Patterns;

//1
//21
//321
//4321
//54321

import java.util.*;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j;
		
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
