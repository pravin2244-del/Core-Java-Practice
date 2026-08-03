package Practice_with_java;

public class Relationofstaticandinstances {
	public static void main(String[] args)
	{
		Aeroplane  aero = new Aeroplane ();
		aero.takeoff();
		// aero.land();
		 Aeroplane.planeticket();//acccess class name to method directly
		
		
	}

}

class Aeroplane 
{    // static variable used in instances method
	static String name = "Air_India";
	
	public void takeoff()
	{
		System.out.println(name);
		System.out.println("planes are going to takeoff");
	}
	
	//instances variable used in static(not possilble)
	/**
	String pilot;
	
	public static void land()
	{  
		System.out.println(pilot);
		System.out.println("pilots landing plane in down");
	} */
	
	public static void planeticket()
	{
		System.out.println("plane tickets are so costly");
	}
}
