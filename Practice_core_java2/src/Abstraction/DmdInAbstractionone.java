package Abstraction;

public class DmdInAbstractionone {
	
	public static void main(String[] args)
	{
		Records rec = new Records();
		
		Cricket cric = new  Test();
		rec. Make_Record(cric);
	}

}

abstract class Cricket
{
	abstract public void play();
}

class OneDay extends Cricket
{
	public void play()
	{
		System.out.println("virat kohali is the legend of Oneday");
	}
}

class Ttwenty extends Cricket
{
	public void play()
	{
		System.out.println("Rohit sharma hits the five century int t20");
	}
}

class Test extends Cricket
{
	public void play()
	{
		System.out.println("sachin is the legend of Test");
	}
}

class Records
{
	public void Make_Record(Cricket c)
	{
		c.play();
		
	}
}
