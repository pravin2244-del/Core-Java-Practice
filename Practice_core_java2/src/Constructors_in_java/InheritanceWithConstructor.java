package Constructors_in_java;

public class InheritanceWithConstructor {

	public static void main(String[] args)
	{
		Son sun = new Son("North");
		System.out.println(sun.getMessege());
		
		
	}
}

class Father 
{
	String messege;
	
	// Paramiterrized constructor
		public Father(String s)
		{
			this.messege=s;
		}
		
	
	public String getMessege()
	{
		return this.messege;
	}
	
	
	
}

class Son extends Father
{
	/** in the case of paramiterized constructor you shoud need to write same constructor inside the child class
	 * same as per parent to describe the output
	 * @param s
	 */
	public Son(String s)
	{
		super(s);
		
	}
	
	
}
