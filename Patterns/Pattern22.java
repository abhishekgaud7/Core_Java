package Patterns;

//1 
//23 
//456 
//78910 
//1112131415 Right Ques.8
import java.util.Scanner;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j,k;
		int num=1;
		
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
				for(j=1;j<=i;j++)
				{
				System.out.print(num);
				num++;
				}
			System.out.println(" ");
		}
	}
}
