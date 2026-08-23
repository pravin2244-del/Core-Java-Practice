package Polymorphism;

public class StaticMethodOverride {
	public static void main(String[] args)
	{
		King k = new Youraj();
		k.rule();
		//k.war();
		
		
	}

}

class King
{
	public void rule()
	{
		System.out.println("The brave king rules long time:");
		
	}
	
	public void tax()
	{
		System.out.println("Tax is help to build kingdome");
	}
	
	public static void war()
	{
		System.out.println("true king never wants war:");
	}
}

class Youraj extends King
{
	public void rule()
	{
		System.out.println("true king is rule to be a people");
	}
	
	public static void war() // this method never overrides because static method never overrides 
	{
		System.out.println("True king always ready to be a war");
		
	}
	
	/**public static void war(String s)
	{
		System.out.println("i likes the wars");
	}*/
}
