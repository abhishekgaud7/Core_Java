package Practice;

public class Prac7 
//MultiLevel Inhertiance
{

	public static void main(String[] args) 
	{
		testttt t=new testttt();
		t.display3();
		t.display4();
		t.display2();
		t.display();
		test3 t1=new test3();
		System.out.println();
		t1.display5();
	}

}
//Multilevel 1-2-3-4-5
class test
{
		public void display()
		{
			System.out.println("Hello World");
		}
}
//Combination of any two inheritance java- hybrid

//does java support multiple inheritance
class testt extends test
{
		public void display2()
		{
			System.out.println("Hello....");
		}
}
class testtt extends testt
{
	public void display3()
	{
		System.out.println("Hello2....");
	}
}
class testttt extends testtt
{
	public void display4()
	{
		System.out.println("Hello3...");
	}
}
class test3
{
	public void display5()
	{
		System.out.println("Hello4...");
	}
}