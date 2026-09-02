package Exception_Handling;

public class Arrayexception {
	public static void main(String[] args)
	{
		try
		{
		int[] array = {23,4,5,5,43,2};
		
		System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		
		finally
		{
			System.out.println("array is collection of same data type");
		}
		
		
		
		
	}

}
