//Write a program to input month number and print month Name
package IF_ELSE;

import java.util.*;

public class QUES_5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Month number");
		int a=sc.nextInt();
		
		if(a==1)
		{
			System.out.println("JANUARY");
		}
		else if(a==2)
		{
			System.out.println("FEBRUARY");
		}
		else if(a==3)
		{
			System.out.println("MARCH");
		}

		else if(a==4)
		{
			System.out.println("APRIL");
		}
		else if(a==5)
		{
			System.out.println("MAY");
		}
		else if(a==6)
		{
			System.out.println("JUNE");
		}
		else if(a==7)
		{
			System.out.println("JULY");
		}
		else if(a==8)
		{
			System.out.println("AUGUST");
		}
		else if(a==9)
		{
			System.out.println("SEPTEMBER");
		}
		else if(a==10)
		{
			System.out.println("OCTOBER");
		}
		else if(a==11)
		{
			System.out.println("NOVEMBER");
		}
		else if(a==12)
		{
			System.out.println("DECEMBER");
		}
		else
		{
			System.out.println("INVALID MONTH");
		}




		
	}
}
