//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package Inheritance_Prac;

public class Prac3 
{
	public static void main(String[] args) 
	{
		Rectangle R=new Rectangle(23.0,20.0);
		double area =R.GetArea();
		System.out.println("The area of the rectangle is: " + area);
	}
}
class Shape
{
	public double GetArea()
	{
		return 0.0;
	}
}
class Rectangle extends Shape
{
	private double Length;
	private double Width;
	
	public Rectangle(double length,double width)
	{
		this.Length=length;
		this.Width=width;
	}
	public double GetArea()
	{
		return  Length*Width;
	}
}