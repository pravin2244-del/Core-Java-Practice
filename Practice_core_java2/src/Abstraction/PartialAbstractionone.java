package Abstraction;

public class PartialAbstractionone {
	public static void main(String[] args)
	{
		
		Stark str = new Ned();
		str.battle("win");
		str.findfood();
		str.winter(05,"come");
		
	}

}
//0% - 100%
abstract class Stark
{
	// abstract method
	abstract public void battle(String n);
	
	abstract public void winter(int b,String s);
	
	// concrete method
	
	public void findfood()
	{
		System.out.println("finding food is to impossible:");
	}
	
	
}

class Ned extends Stark
{
	public void battle(String n)
	{
		System.out.println("ned stark helps to won battle to the robbert");
	}
	
	public void winter(int b,String s)
	{
		System.out.println("winter is comming");
	}
	
	public void findfood()
	{
		System.out.println("finding food  possile:");
	}
	
	
}