package Exception_Handling;

public class CompiletimeException {
	public static void main(String[] args)
	{
		int num =10;
		try {
			if(num>5)
			{
				throw new Exception();
			}
		}
		catch(Exception run)
		{
			run.printStackTrace();
		}
		System.out.println("good Evening");
		
		
	}

}
