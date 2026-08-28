package Exception_Handling;

public class ElectionException {
	public static void main(String[] args)
	{
		int age = 16;
		
		try
		{
			if(age<18)
			{
				throw new Exception("Age is not insuffisient");
			}
			else
			{
				System.out.println("your eligible for voting");
			}
		}
		catch(Exception mx)
		{
			System.out.println(mx.getMessage());
			//mx.printStackTrace();
		}
		
		System.out.println("cool banda!");
		
	}

}


