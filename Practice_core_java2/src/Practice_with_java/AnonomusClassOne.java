package Practice_with_java;

public class AnonomusClassOne {
	
	public static void main(String[] args)
	{
		I_Flight flight = new I_Flight() {
			public void takeoff()
			{
				
				System.out.println("Every Plane takesoff ");
			}
			
			public void takedown()
			{
				System.out.println("Every plane takes down");
			}
		};
		
		flight.takeoff();
		flight.takedown();
	}

}

interface I_Flight
{
	void takeoff();
	
	void takedown();
	
	
}
