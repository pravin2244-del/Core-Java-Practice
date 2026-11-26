package Thiskeyword;

public class constructorcall {
	public static void main(String[] args)
	{
		Gothrone two = new Gothrone(1,"john snow","Whitewalker");
		/* two.rank = 4;
		two.hero = "Arya Stark";
		two.villain = "Cersi Lanister"; */
		
		
		System.out.println(two.rank);
		System.out.println(two.hero);
		System.out.println(two.villain);
	}

}

class Gothrone
{
	int rank;
	String hero;
	String villain;
	
	public Gothrone()
	{
		
		System.out.println("Kill the boy john snow let the man be born");
		System.out.println("* I am the first *");
	}
	
	public Gothrone(int rank,String hero)
	{ 
		this();
		System.out.println("john snow avenged the red wedding he is a white wolf");
		System.out.println("** I am the Second **");
	}
	
	public Gothrone(int rank,String hero,String villain)
	{
		this(2,"Robb statrk");
		System.out.println("winter is comming!");
		System.out.println("*** I am the third ***");
	}
	
	
}
