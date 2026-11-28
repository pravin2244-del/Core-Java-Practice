package Polymorphism;

public class MethodOverridingthree {
	
	public static void main(String[] args)
	{
		
		Agon one = new Agon();
		one.rule();
		
	}

}

class Agon
{
	public void rule()
	{
		System.out.println("Agon is the real conqurer");
	}
}

class Agonone extends Agon
{
	public void rule()
	{
		System.out.println("Agon two is the real king");
	}
	
}
