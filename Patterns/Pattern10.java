package Patterns;

// 1
// 11
// 121
// 1331
// 14641
public class Pattern10 
{
	public static void main(String[] args) 
	{
		
		  // dhrumil.mca05@gmail.com // 8866874101
		 int n = 5;
	        int base = 11;
	        int result = 1;
	        int k;

	        for (int i = 1; i <= n; i++) 
	        {
	            System.out.println(result+" ");
	            result *= base;
	        }
	}
}