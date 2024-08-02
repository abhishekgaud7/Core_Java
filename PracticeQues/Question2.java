//2.Write a Java program to create a class called "Dog" with a name and breed attribute. 
//Create two instances of the "Dog" class,set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
package PracticeQues;

public class Question2 
{
	  public static void main(String[] args) 
	  {
	        // Create two instances of Dog
	        Dog dog1 = new Dog("Buddy", "Golden Retriever");
	        Dog dog2 = new Dog("Max", "Bulldog");

	        // Print initial details
	        System.out.println("Initial Details:");
	        dog1.printDetails();
	        dog2.printDetails();

	        // Modify the attributes using setter methods
	        dog1.setName("Charlie");
	        dog1.setBreed("Labrador");
	        
	        dog2.setName("Rocky");
	        dog2.setBreed("Beagle");

	        // Print updated details
	        System.out.println("\nUpdated Details:");
	        dog1.printDetails();
	        dog2.printDetails();
	    }
}	  
class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to print Dog details
    public void printDetails() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}
