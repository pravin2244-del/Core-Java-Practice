package Abstraction;

public class PartialAbstraction {
	
	public static void main(String[] args)
	{
		
		Trucks t = new Mahindra();
		t.start("pravin");
		t.stop(12);
		t.run();
	}

}

// 0%-100%
abstract class Trucks
{
	// abstarct method
	abstract public void start(String i);
	
	abstract public void stop(int i);
	
	//concrete method
	
	public void run()
	{
		System.out.println("running the truck:");
	}
	
	
}

class Mahindra extends Trucks
{
	public void start(String i)
	{
		System.out.println(i.toUpperCase());
	}
	
	public void stop(int i)
	{
		System.out.println(100+i);
	}
	
	public void run()
	{
		System.out.println("king in the North:");
	}
}
