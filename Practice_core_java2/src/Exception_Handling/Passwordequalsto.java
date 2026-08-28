package Exception_Handling;

public class Passwordequalsto {
	public static void main(String[] args)
	{
		String str = "ABC@123";
		String  str1 = "ABC@123";
		
		
		try
		{
			
			if(str.equals(str1))
			{
				System.out.println("Login successful");
			}
			else
			{
				throw new Exception("Invalid password");
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("welcome sir/madam");
	}

}
