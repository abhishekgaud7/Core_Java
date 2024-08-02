package Practice;

public class Prac8 
{
	public static void main(String[] args)
	{
		/* 
		 * inheritance - at leats minimum 2 class
		 * 
		 * 1-class-child
		 * 1-class-parent
		 * 
		 * child can use the funtionality of parent class using extends keyword
		 * code resuebility
		 * code optimization
		 * 
		 * class login
		 * {
		 * 		email and pass mobile-1000
		 * 
		 * }
		 *  class payment extends login
		 *  {
		 *  
		 *  }
		 * types of inheritance
		 * 1.Single Level inheritance-1 child class / 1 parent class
		 * 2.Multiple inheritance - 1 child class and more than 1 parent class 
		 * but java can not accept multiple inheritance
		 * 3.Multi level inheritance 1-2-3-4-5
		 * 4.Hybird inheritance- Combination of any two inheritance
		 * 5.Heirarchical inheritance-
		 * 
		 * 
		 */
		hr h=new hr();
		h.emp();
		h.salary();
		
	}
}
class teamleader
{
	public void project()
	{
		System.out.println();
	}
}
class empdetail // parent
{
	public void emp()
	{
		System.out.println("Abhishek,Software engg.,Ahmedabad");
	}
}
class hr extends empdetail // child
{
	public void salary()
	{
		System.out.println("Salary depend on work");
	}
}