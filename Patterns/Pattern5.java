package Patterns;

//1
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5  middle Ques.1

import java.util.Scanner;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j,k;
		
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
				System.out.println();
		}
	}
}
