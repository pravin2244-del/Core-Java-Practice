package Exception_Handling;

public class PipeOperator {
	public static void main(String[] args)
	{
		String str = "red";
		
		try
		{
			if(str.equals("red"))
			{
				throw new Rsignal("come on stop the car");
			}
			else if(str.equals("Green"))
			{
				throw new Gsignal("come Drive fast this is hari batti");
			}
			else if(str.equals("Yellow"))
			{
				throw new Ysignal();
			}
		}
		
		catch(Gsignal | Rsignal |Ysignal ex) //Same level exceptions(brothers)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		finally
		{
			System.out.println("kyu dikhe mujhe tu tere hone mere ,chhnna ve");
		}
		
	}

}

class Gsignal extends Exception
{
	public Gsignal(String str)
	{
		super(str);
	}
}

class Rsignal extends Exception
{
	public Rsignal(String str)
	{
		super(str);
	}
}

class Ysignal extends Exception
{
	public Ysignal()
	{
		super("I am a knight i shall die as a night");
	}
}
