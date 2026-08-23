package Polymorphism;

public class FinalmethodOverrides {
	
	public static void main(String[] args)
	{
		Business one = new NextGen();
		one.higher_emplpoyee();
		one.Do_bussiness();
	}

}

class Business
{
	public void higher_emplpoyee()
	{
		System.out.println("employee are works like soldiers");
	}
	
	final public void Do_bussiness()
	{
		System.out.println("As per Ansistores");
	}
}

class NextGen extends Business
{
	/**final public void Do_bussiness()
	{
		System.out.println("As per Genz");
	}*/
	// you cannot Overrides Final method
	
	public void higher_emplpoyee()
	{
		System.out.println("some employees are lazy");
	}
	
}
