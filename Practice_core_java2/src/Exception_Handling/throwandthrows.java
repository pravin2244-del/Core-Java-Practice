package Exception_Handling;

public class throwandthrows {
	
	public static void main(String[] args)
	{
		Visa v = new Visa();
		//Prpogation
		try
		{
		v.apply();
		}
		catch(AException | BException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}

class Visa 
{
	public void apply() throws AException,BException
	{
		int age = 34;
		if(age>10 && age<20 )
		{
			throw new AException();
		}
		else if(age>20 && age<40)
		{
			throw new BException();
		}
		
	}
}

class AException extends Exception
{
	
}

class BException extends Exception
{
 
}
