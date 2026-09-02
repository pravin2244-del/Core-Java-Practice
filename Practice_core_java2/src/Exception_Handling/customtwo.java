package Exception_Handling;

public class customtwo {
	public static void main(String[] args)
	{
		String traffic_light = "red";
		
		try
		{
			
			System.out.println(20/0);
			
			if(traffic_light.equals("red"))
			{
				throw new Redsignal();
				
			}
			
			else if(traffic_light.equals("Yellow"))
			{
				throw new Yellowsignal();
				
			}
			
			else if(traffic_light.equals("Green"))
			{
				throw new Greensignal();
				
			}
			else
			{
				throw new Exception();
			}
			
			
		}
		catch(Redsignal ex)
		{
			ex.printStackTrace();
		}
		
		catch(Yellowsignal ex)
		{
			ex.printStackTrace();
		}
		
		catch(Greensignal ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	
	finally
	{
		System.out.println("North rembers we know no king");
	}
}

}
class Redsignal extends Exception
{
	public Redsignal()
	{
		super("this is the red signal stop the vehicle");
	}
}

class Yellowsignal extends Exception
{
	public Yellowsignal()
	{
		super("this is the Yellow signal go slow");
	}
}
class Greensignal extends Exception
{
	public Greensignal()
	{
		super("this is the Green signal Go fast");
	}
}