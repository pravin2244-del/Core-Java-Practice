package Constructors_in_java;

public class ConstructorInjuctionone {
	public static void main(String[] args)
	{
		Animal animal = new Animal("Dragon",180);
		
		System.out.println(animal.name);
		System.out.println(animal.age);
		
		
		
	}

}

class Animal
{
	String name;
	int age;
	public Animal()
	{
		
	}
	
	public Animal(String name)
	{
		this.name = name;
		System.out.println("*");
		
		
	}
	
	public Animal(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("**");
		
	}
	
}
