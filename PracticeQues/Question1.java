//1. Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package PracticeQues;

public class Question1 
{
	public static void main(String[] args) 
	{
		Person P=new Person("Abhishek",20);
	}
}
class Person
{
	String Name;
	int Age;
	 Person(String Name , int Age)
	{
		this.Name=Name;
		this.Age=Age;
		System.out.println("Your Name And Age = " +Name+" "+Age);
	}
}
