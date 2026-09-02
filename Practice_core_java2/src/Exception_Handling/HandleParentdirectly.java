package Exception_Handling;

public class HandleParentdirectly{
	
	public static void main(String[] args)
	{
		int age = 45;
		
		try
		{
			if(age>20 && age<30)
			{
			throw new OneException("dosen't matters inside the program how many exceptions are present but at a time only one exception occurs");
		    }
			else if(age>30 && age<40)
			{
				throw new TwoException("2nd exception");
			}
			else if(age>40 && age<50)
			{
				throw new ThirdException("3rd exception");
			}
			else
			{
				System.out.println("No exception");
			}
		}
		
		
		
		catch(OneException ex)
		{
			ex.printStackTrace();
		}
		
		catch(TwoException ex)
		{
			ex.printStackTrace();
		}
		
		
		catch(ThirdException ex)
		{
			ex.printStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		finally
		{
			System.out.println("Exception occurs or not this block always runs");
		}
		
	}

}

class OneException extends Exception
{
	public OneException(String str)
	{
		super(str);
	}
	
}

class TwoException extends Exception
{
	public TwoException(String str)
	{
		super(str);
	}
}

class ThirdException extends Exception
{
	public ThirdException(String str)
	{
		super(str);
	}
}

