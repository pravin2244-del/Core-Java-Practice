package Polymorphism;

public class MethodOverridingfive {
	
	public static void main(String[] args)
	{
		
		Player play = new Playerone();
		play.Performance();
		
	}

}

class Player
{
	public void Performance()
	{
		System.out.println("virat is the great player in the test");
	}
}

class Playerone extends Player
{
	public void Performance()
	{
		System.out.println("Roihit is the great player in white ball");
	}
}
