package Practice;

import java.util.*;

public class Prac9 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String FirstName =sc.nextLine();
		System.out.println("Enter Your Last Name");
		String LastName =sc.nextLine();
		System.out.println("Enter Your Mobile No.");
		double MobileNo=sc.nextDouble();
		System.out.print("Enter Your City Name");
		String City =sc.nextLine();
		System.out.print("Enter Your Address");
		String Address =sc.nextLine();
		System.out.print("Enter Your Education");
		String Education =sc.nextLine();
		System.out.println("Enter Your Occupation");
		String Occupation =sc.nextLine();
		System.out.println("----------------------------Your Registration Details-------------------------------");
		System.out.println("First Name:"+FirstName);
		System.out.println("Last Name:"+LastName);
		System.out.println("Mobile No:"+MobileNo);
		System.out.println("City:"+City);
		System.out.println("Address:"+Address);
		System.out.println("Education:"+Education);
		System.out.println("Occupation:"+Occupation);

	}
}
