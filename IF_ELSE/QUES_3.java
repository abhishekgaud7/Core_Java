//Write a program to check whether a character is uppercase or lowercase.
package IF_ELSE;

import java.util.*;

public class QUES_3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Alphabet:");
		char ch= sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UPPER CASE");
			
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("LOWER CASE");
		}
		else
		{
			System.out.println("INVALID ALPHABET");
		}
	}
}
