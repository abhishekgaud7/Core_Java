package com.simple;

public class Condition4 
{	
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("A is Max....");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Max....");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is Max...");
		}
		
		
	}
}
