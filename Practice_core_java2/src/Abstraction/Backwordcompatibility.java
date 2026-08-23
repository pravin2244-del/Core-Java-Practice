package Abstraction;

public class Backwordcompatibility {
	
	static public void main(String[] args)
	{
		I_Play p = new Hocky();
		p.play();
		p.out();
	}

}

interface I_Play
{
	void play();
	default void out() // default is not acess modifier is it type of method
	{
		System.out.println("05/12/2004");
	}
	
}

class Hocky implements I_Play
{
	public void play()
	{
		System.out.println("this is play method of parent interface");
	}
	
	/*public void out()
	{
		System.out.println("change implemention");
	} */
}
