package Abstraction;

public class Diamondproblemsolution {
	
	public static void main(String[] args)
	{
		Xerox x = new Xerox();
		x.run();
		
	}

}

interface I_one
{
	void demo();
	default public void run()
	{
		System.out.println("runnaway");
	}
	
}

interface I_Two
{
	void demo();
	
	default public void run()
	{
		System.out.println("1234");
		
		
	}
	
}

class Xerox implements I_one,I_Two
{

	@Override
	public void demo() {
	System.out.println("i am the rockstar");
		
	}
	
	 public void run()
	{
		System.out.println("I am the north runner");
	
	 I_one.super.run();
	 I_Two.super.run();
	}
	
	
	
}