package Polymorphism;

public class Methodoverloadingone {
	public static void main(String[] args)
	{
		
		Cricket cric = new Cricket();
		cric.format("Virat",18,85);
		cric.format(19323,9230);
		
	}

}

class Cricket
{
	public void format(String a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
	public void format(int i,int j)
	{
		System.out.println(i%j);
	}
}
