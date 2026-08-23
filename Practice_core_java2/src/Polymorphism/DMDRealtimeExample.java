package Polymorphism;

public class DMDRealtimeExample {
	
	public static void main(String[] args)
	{
		River river = new Narmada();
		
		River_system rs = new River_system();
		rs.handleRiver(river);
		
	}

}

class River
{
	public void flow()
	{
	 System.out.println("parent river:");
	}
}

class Narmada extends River
{
	public void flow()
	{
	 System.out.println("Narmada river:");
	}
	
}
class terans extends River
{
	public void flow()
	{
	 System.out.println("Terana river:");
	}
	
}

class Godavari extends River
{
	public void flow()
	{
	 System.out.println("Godavari:");
	}
}

class River_system
{
	public void handleRiver(River river)
	{
		System.out.println("handling river system");
	  river.flow();
	}
	
}