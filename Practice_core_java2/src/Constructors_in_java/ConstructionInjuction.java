package Constructors_in_java;

public class ConstructionInjuction {
	public static void main(String[] args)
	{
		Flipcart_order first = new Flipcart_order("pune","76574456556",64546,"4110148");
		System.out.println(first.Address);
		System.out.println(first.Mobile);
		System.out.println(first.price);
		System.out.println(first.pincode);
		
		
	}

}

class Flipcart_order
{
	String Address;
	String Mobile;
	double price;
	String pincode;
	
	public Flipcart_order(String Address,String Mobile)
	{
		this.Address = Address;
		this.Mobile = Mobile;
		System.out.println("*");
	
		
	}
	
	public Flipcart_order(String Address,String Mobile,double price)
	{
		this.Address = Address;
		this.Mobile = Mobile;
		this.price = price;
		
		System.out.println("**");
		
	}
	
	
	public Flipcart_order(String Address,String Mobile,double price,String pincode)
	{
		this.Address = Address;
		this.Mobile = Mobile;
		this.price = price;
		this.pincode = pincode;
		System.out.println("***");
		
	}
	
}