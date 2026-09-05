package Exception_Handling;

//import java.io.Closeable;
//import java.util.Scanner;

public class trywithresource {
	public static void main(String[] args)
	{
		try(ABCD abcd = new ABCD();)
		{
			System.out.println("*******");
		}
		catch(Exception ex)
		{
			
		}
		System.out.println("@@@@@@@@@@@");
		
	}

}

class ABCD implements AutoCloseable 
{
	public void close() throws Exception
	{
		System.out.println("shut the resource off");
	}
}
