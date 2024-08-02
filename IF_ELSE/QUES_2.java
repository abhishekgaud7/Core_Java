//Write a program to input any alphabet and check whether it is vowel or consonant.
package IF_ELSE;

import java.util.*;

public class QUES_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Alphabet:");
		char ch=sc.next().charAt(0);
		
		if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
