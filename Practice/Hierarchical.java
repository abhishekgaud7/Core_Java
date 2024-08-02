package Practice;

public class Hierarchical 
{
	public static void main(String[] args) 
	{
		Fourth F =new Fourth();
		F.get4();
		F.get3();
		F.get2();
		F.get1();
	}
}
class Type
{
	public void get1()
	{
		System.out.println("Hello1");

	}
}
class Second extends Type
{
	public void get2()
	{
		System.out.println("Hello2");

	}
}
class Third extends Second
{
	public void get3()
	{
		System.out.println("Hello3");

	}
}
class Fourth extends Third
{
	public void get4()
	{
		System.out.println("Hello4");

	}
}