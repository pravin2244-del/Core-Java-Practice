package StreamApiBasics;

public class Anonumousclass {
	
	public static void main(String[] args)
	{
		I_Bike b = new I_Bike() {
			
			public void slow()
			{
				System.out.println("*******************");
				System.out.println("my bike is to slow:");
			}
			
			public void unsafe()
			{
				System.out.println("bike traveling is to unsafe");
			}
		};
		
		b.slow();
		b.unsafe();
	}

}

interface  I_Bike
{
	void slow();
	
	void unsafe();
}
