package Inheritance;

public class MethodOverriding {
	public static void main(String[] args)
	{
		Father father = new Son();
		father.farming();
		
	}

}
class Father
{
	public void farming()
	{
		System.out.println("Traditional farming");
	}
	
	public void irrigation()
	{
		System.out.println("tradition approach");
	}
	
}

class Son extends Father
{
	public void farming()
	{
		System.out.println("Mechanism::tractor");
	}
}
