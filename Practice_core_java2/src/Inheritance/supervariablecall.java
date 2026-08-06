package Inheritance;

public class supervariablecall {
	public static void main(String[] args)
	{
		Lion first = new Lion();
		first.finalweight();
		
	}

}

class Animal
{
	//String name;
	int age;
	public Animal(String s,int i)
	{
		System.out.println("Parent class");
	}
	
	String name = "amazon";
	
	public int getweight()
	{
		return 100;
	}
	
}

class Lion extends Animal
{
	public void finalweight()
	{
		System.out.println(super.name);
		System.out.println(super.getweight()+200);
	}
	
	public Lion()
	{
		super("abc",20);
		System.out.println("child class");
	}
	
}
