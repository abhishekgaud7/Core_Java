package DSA_JAVA;

public class HomeWork16 
{
	public static void main(String[] args) 
	{
		 for(int i=1; i<=5; i++) {
	           //spaces
	           for(int j=1; j<=5-i; j++) {
	               System.out.print(" ");
	           }


	           //first part
	           for(int j=i; j>=1; j--) {
	               System.out.print(j);
	           }


	           //second part
	           for(int j=2; j<=i; j++) {
	               System.out.print(j);
	           }
	           System.out.println();
	       }

	}
}
