package Patterns;

//5 
//4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5  Middle Ques.3


import java.util.Scanner;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j,k;
		
		for(i=5;i>=1;i--)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
				for(j=i;j<=5;j++)
				{
					System.out.print(j+" ");
				}
			System.out.println();
		}

	}
}
