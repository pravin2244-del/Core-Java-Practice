package Polymorphism;

public class MethodOveridingfour {
	public static void main(String[] args)
	{
		
		Dhoni d = new Rohit();
		d.captancy();
	}

}

class Dhoni
{
	public void captancy()
	{
		System.out.println("Dhoni is the great captain in the world");
	}
	public void wicketkeeping()
	{
		System.out.println("Dhoni is the great Keeper in the world");
	}
}

class Rohit extends Dhoni
{
	public void captancy()
	{
		System.out.println("Rohit  sharma is the great captain in the world");
	}
	
}
