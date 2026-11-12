package Constructors_in_java;

public class settermethod {
	public static void main(String[] args)
	{
		
		Student first = new Student();
		/**first.name = "Porus";
		first.name = " Pj09878@gmail.com";*/
		first.setName("raj");
		first.setName("porus");
		System.out.println(first.getName());
		
	}

}

class Student
{
	String name;
	String email;
	
	public void setName(String nm)
	{
		if(nm.length()>=4)
		{
			this.name=nm;
		}
		System.out.println("WHENEVER YOU USE TO SETTER METHOD TO SET THE VALUE OF INSTANCES VARIABLE IT IS CALLED AS SETTER INJUCTION");
	}
	
	public String getName()
	{
		return this.name;
	}
}