package Patterns;

/*
 5
 45
 345
 2345
 12345
 */
import java.util.*;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter The Row:");
		int i=sc.nextInt();
		int j;
		
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
				System.out.println();
		}
	}
}

