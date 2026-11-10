package Inheritance;

public class PandCclass {
	public static void main(String[] args)
	{
		//College one = new College();
		Department one = new Department();
		one.computer_programs();
		one.Days();
		
	}

}

class College
{
	static String name;
	String address;
	
	public void cultural_activity()
	{
		System.out.println("evry coolege takes cultural activities in february");
	}
	
	public void Days()
	{
		System.out.println("College celebrates seven days:");
		
	}
	
	public void Annual_Day()
	{
		System.out.println("On annual day may friend dance front of all faculty");
	}
	
}

class Department extends College
{
	public void computer_programs()
	{
		System.out.println("computers");
	}
}
