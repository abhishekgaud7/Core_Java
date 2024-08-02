//1. Write a Java program to create a class called Animal with a method called makeSound(). 
//Create a subclass called Cat that overrides the makeSound() method to bark.
package Inheritance_Prac;

public class Prac1 
{
	public static void main(String[] args) 
	{
		Cat C=new Cat();
		C.Data();
		
	}
}
class Animal
{
	public void MakeSound(int a,int b)
	{
		System.out.println("Meow..");
	}
}
class Cat extends Animal
{
	public void MakeSound(int a,int b)
	{
		System.out.println("Bark..");
	}
	public void Data()
	{
		this.MakeSound(13, 14);
		super.MakeSound(13,14);
	}
}
  