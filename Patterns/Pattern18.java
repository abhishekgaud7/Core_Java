package Patterns;

//1
//10
//101
//1010
//10101 RIght Ques.6
import java.util.Scanner;

public class Pattern18 
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
				for(j=1;j<=i;j++)
				{
					if(j%2==1)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
			System.out.println(" ");
				
		}
	}
}
