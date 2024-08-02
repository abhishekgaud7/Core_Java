package Patterns;

//a  
//a b  
//a b c  
//a b c d  
//a b c d e  Middle Ques.9

public class Pattern25 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) 
		 {
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print((char) ('a'+ j - 1));
	                System.out.print(" ");
	            }
	          System.out.println(" ");
	        }
	}
}
