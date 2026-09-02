package Exception_Handling;

public class runtimeException {
	public static void main(String[] args)
	{
		int num = 10;
		if(num>5)
		{
		throw new RuntimeException();
		}
		
		System.out.println("good morning");
	}

}
