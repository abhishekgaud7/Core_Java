package Patterns;

//1
//23 
//456 
//78910 
//1112131415 

import java.util.*;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j;
		int num=1;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
				System.out.println(" ");
		}
		
		
	}
}
