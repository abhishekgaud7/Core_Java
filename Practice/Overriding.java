package Practice;

public class Overriding 
{ 
	public static void main(String[] args) 
	{
		Temp T=new Temp();
		T.Data();
		// Method Overriding-- 1 Class -- More Than 1 Method --  Same Name Same Parameter.
	}
}
class employee
{
	public void empdetails(String uname, String pass)
	{
		System.out.println("Hello Moto.....");
	}
}
// this  --  Child and Super -- Parent

class Temp extends employee
{
	public void empdetails(String uname, String pass)
	{
		System.out.println("Hello Google....");
	}
	public void Data() 
	{
		this.empdetails("abhi", "123");
		super.empdetails("abhishek", "12345");
	}
}
