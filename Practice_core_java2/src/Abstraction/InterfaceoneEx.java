package Abstraction;

public class InterfaceoneEx {
	
	public static void main(String[] args)
	{
		I_Throne throne = new king();
		throne.War("mahadev");
		throne.Battle("its_pravin",052004);
	}

}

interface I_Throne
{
	// Abstract and public method
	 void War(String m);
	 
	 void Battle(String i,int n);
	 
}

interface I_Kingdom
{
	void fight(int j,int l);
}

class king implements I_Throne
{

	@Override
	public void War(String m) {
		System.out.println(m.toUpperCase());
		
	}

	@Override
	public void Battle(String i,int n) {
		System.out.println(i+n);
		
	}
	
	
}