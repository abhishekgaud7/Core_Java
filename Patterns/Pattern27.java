//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1

package Patterns;

public class Pattern27 
{
	public static void main(String[] args) 
	{
		int result=1;
		int base=11;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println(result+" ");
			result*=base;
		}
		
		
	}
}
