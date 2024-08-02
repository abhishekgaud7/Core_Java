package Patterns;


//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1   Middle Ques.2
import java.util.Scanner;

public class Pattern13 
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
					System.out.print(j+" ");
				}
			System.out.println();
		}
	}
}
