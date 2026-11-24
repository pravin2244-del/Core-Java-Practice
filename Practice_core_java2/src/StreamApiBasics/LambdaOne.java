package StreamApiBasics;

public class LambdaOne {
	
	public static void main(String[] args)
	{
		I_Architecture arc = ()->{return "konark_Suryamandir";};
		
		System.out.println(arc.Architect());
		
		
	}

}

interface I_Architecture
{
	String Architect();
}
