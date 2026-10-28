package Exception_Handling;

public class Supernumber {
	public static void main(String[] args)
	{
		int num = 19;
		
		try
		{
			if(num%2!=0 && num%3!=0)
			{
				throw new Exception("not a super number");
			}
			else
			{
				System.out.println("super number");
			}
		 }
		
		  catch(Exception ex)
          {
				ex.printStackTrace();
		  }
		
		System.out.println("Execution completly");
		
		
	}

}
