package Patterns;

/*
5
54
543
5432
54321
*/

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j;
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
				System.out.println();
		}
	}
}
