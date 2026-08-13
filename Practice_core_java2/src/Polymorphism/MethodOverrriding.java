package Polymorphism;

public class MethodOverrriding {
	public static void main(String[] args)
	{
		Crickinfo cric = new Cricketer(); // it is also called as DMD
		cric.virat();
		
	}

}

class Crickinfo
{
	String Cricketer_name;
	
	public void virat()
	{
		System.out.println("Virat kohali is known as  king of the cricket ");
	}
	
	public void rohit()
	{
		System.out.println("rohit sharma is known as sixer king");
	}
}

class Cricketer extends Crickinfo
{
	public void virat()
	{
		System.out.println("virat kohali is GOAT of cricket");
	}
}
