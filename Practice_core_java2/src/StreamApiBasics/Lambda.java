package StreamApiBasics;

public class Lambda {
	public static void main(String[] args)
	{
		I_Temple t = ()->{System.out.println("Ancient Architecture:");};
			
		t.Architecture();	
   }

}

interface I_Temple
{
	void Architecture();
	
	//we can take only one method at a time
}
