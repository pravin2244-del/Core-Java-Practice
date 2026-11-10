package Inheritance;

public class supervariablecallone {
	public static void main(String[] args)
	{
	 Format first = new Format();
	 first.test();
	}

}

class Cricket
{
	String captain = "Rohit";
	int captain_runs = 200202;
	String voice_captain = "hardik";
	
	public void chase()
	{
		System.out.println("Virat kohali is also known as chase master:");
	}
	
	public void defend()
	{
		System.out.println("Rohit sharama can defends lowest totals");
	}
}

class Format extends Cricket
{
	public void test()
	{
		System.out.println(super.captain_runs+1000);
		super.chase();
		super.defend();
	}
	
	
	
	
}
