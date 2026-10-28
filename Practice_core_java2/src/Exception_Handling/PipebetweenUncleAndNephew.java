package Exception_Handling;

public class PipebetweenUncleAndNephew {
	public static void main(String[] args)
	{
		String str = "Owner_of_sword or sword_of_the_Morning";
		
		try
		{
			if(str.equals("knight"))
			{
				throw new Knight(" I am a kinight i shall die as a knight");
			}
			else if(str.equals("Warrior"))
			{
				throw new Warrior();
			}
			else if(str.equals("kshatriya"))
			{
				throw new kshatriya("kul devi ke rup mein kshatriya kul ka kalyan karne wali maa bhagavte tuze naman");
			}
		}
		
		catch(Knight | Warrior |kshatriya ex)
		{
			ex.printStackTrace();
		}
		
		finally
		{
			System.out.println("Plese suggest any tag line for warrior");
		}
		
		
	}

}

class Knight extends Exception
{
	public Knight(String str)
	{
		super(str);
	}
}

class Warrior extends Exception
{
	
}

class kshatriya extends Throwable
{
	public kshatriya(String str)
	{
		super(str);
	}
}
