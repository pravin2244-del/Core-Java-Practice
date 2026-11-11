package Exception_Handling;

public class customclassone {
	
	public static void main(String[] args)
	{
		int num = 10;
		
		try
		{
			if(num>20)
			{
				throw new InvalidnumberException("your number is not enough");
			}
			else
			{
				System.out.println("you take the perfect number:");
			}
		}
		catch(InvalidnumberException ex)
		{
			ex.printStackTrace();
		}
	}

}

class InvalidnumberException extends Exception
{
	public InvalidnumberException(String str)
	{
		super(str);
	}
}
