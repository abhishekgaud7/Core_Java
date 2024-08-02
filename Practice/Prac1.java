package Practice;

public class Prac1 
{
	public static void main(String[] args) 
	{
			First F=new First();
			F.Get_Add();
			F.Get_Sub();
			F.Get_Mul();
			F.Get_Div();
		
	} 
}

class First
{
	public void Get_Add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	
	 public void Get_Sub()
	{
		int a=200;
		int b=130;
		int c=a-b;
		System.out.println("Substraction is "+c);
	}
	
	public void Get_Mul()
	{
		int a=12;
		int b=15;
		int c=a*b;
		System.out.println("Mulitplication is "+c);
	}
	
	public void Get_Div()
	{
		int a=120;
		int b=40;
		int c=a/b;
		System.out.println("Division is "+c);
	}

}	