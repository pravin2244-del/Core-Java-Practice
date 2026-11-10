package Inheritance;

public class superconstructor {
	public static void main(String[] args)
	{
		Mounts not = new Mounts();
		
		
	}

}

class Valley
{
	public Valley(String s)
	{
		System.out.println("sena");
	}
	public void dispaly()
	{
		System.out.println("Nort remembers we know know king");
	}
}

class Mounts extends Valley
{
	public Mounts()
	{
		super("abc");
		System.out.println("child class");
	}
}

