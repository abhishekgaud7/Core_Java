package Patterns;

//1
//21
//321
//4321
//54321 Right Ques.2
import java.util.Scanner;

public class Pattern12 
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
				for(j=i;j>=1;j--)
				{
					System.out.print(j);
				}
			System.out.println();
		}
	}
}
