package Exception_Handling;

public class Customexception {
	public static void main(String[] args)
	{
	
	int age = 28;
	
	try
	{
		if(age>20)
		{
			throw new InvalidAgeException("you are not able to voting");
		}
		else
		{
			System.out.println("congrats you are mature right now");
		}
	}
	catch(InvalidAgeException ex)
	{
		ex.printStackTrace();
	}
	
	finally
	{
		System.out.println("the voting is the most important thing in the life");
	}

}
}

class InvalidAgeException extends Exception
{
	
	
	public InvalidAgeException(String str)
	{
		super(str);
	}
	
	
	
}
