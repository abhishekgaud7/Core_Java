package Patterns;

/*
5
54
543
5432
54321 Middle Ques.4
*/
import java.util.Scanner;

public class Pattern17 
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
				for(j=5;j>=i;j--)
				{
					System.out.print(j+" ");
				}
			System.out.println();
		}
	}
}
