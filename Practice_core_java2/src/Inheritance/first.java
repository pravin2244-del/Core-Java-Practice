package Inheritance;

public class first {
	public static void main(String[] args)
	{
		
		Prince2 Ragnar = new Prince2();
		
		
		Ragnar.Horseriding();
		Ragnar.battle();
		Ragnar.practice();
	
		
		
	}

}

class King
{
	String name;
	
	public void battle()
	{
		System.out.println("Every king can always ready to battle:");
	}
	
	public void Marriage()
	{
		System.out.println("In past every king did more than one marrages:");
	}
	
}

class Prince1 extends King
{
	public void practice()
	{
		System.out.println("every prince can do practice:");
		
	}
		
	
	
}

class Prince2 extends Prince1
{
	public static void Horseriding()
	{
		System.out.println("Every prince need to ride a horse");
	
	}
	


}
