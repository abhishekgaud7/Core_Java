//3. Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.
package PracticeQues;

public class Question3 
{
	public static void main(String[] args) 
	{
		   Rectangle rect = new Rectangle(5.0, 3.0);

	        System.out.println("Details of Rectangle ");
	        rect.printDetails();

	    
	}
}
class Rectangle
{
	private double Length;
	private double width;
	
	public Rectangle(double Length, double width)
	{
		this.Length=Length;
		this.width=width;
	}
	public double Get()
	{
		return Length;
	}
	public void Set(double Length)
	{
		this.Length=Length;
	}
	public double Get2()
	{
		return width;
	}
	public void Set2(double width)
	{
		this.width=width;
	}
	
	public double Area()
	{
		return Length*width;
	}
	public double Perimeter()
	{
		return 2*(Length+width);
	}
	 public void printDetails() {
	        System.out.println("Rectangle Length: " + Length + ", width: " + width);
	        System.out.println("Area: " + Area() + ", Perimeter: " + Perimeter());
	    }
	
}