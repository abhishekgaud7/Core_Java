//1. Write a program to check whether a number is negative, positive or zero.

package IF_ELSE;
import java.util.*;

public class QUES_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Number Is Positive");
		}
		else if(a<0)
		{
			System.out.println("Number IS Neagtive");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
