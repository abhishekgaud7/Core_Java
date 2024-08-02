// Write a Java program to create a class called Vehicle with a method called drive(). 
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package Inheritance_Prac;

public class Prac2 
{
	public static void main(String[] args) 
	{
		Car C=new Car();
		C.Data();
	}
}
class Vehicle
{
	public void Drive(int a,int b)
	{
		System.out.println("Repairing A Vehicle");
	}
}
class Car extends Vehicle
{
	public void Drive(int a,int b)
	{
		System.out.println("Repairing A Car");
	}
	public void Data()
	{
		super.Drive(12, 13);
		this.Drive(14, 20);
	}
}