package Patterns;

//1
//01
//101
//0101
//10101 Right Ques.7 

import java.util.Scanner;

public class Pattren20 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i = sc.nextInt();
		int j,k;
		
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
				for(j=i;j>=1;j--)
				{
					System.out.print(j%2);
				}
			System.out.println();
				
		}

	}
}
