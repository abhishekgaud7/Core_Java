package Patterns;

//1
//12
//123
//1234
//12345   right Ques.1
import java.util.Scanner;

public class Pattern11 
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
					System.out.print(j);
				}
			System.out.println();
		}

	}
}
