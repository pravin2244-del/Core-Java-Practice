package Constructors_in_java;

public class constructorinmethodsignature {
	public static void main(String[] args)
	{
		Cars one = new Cars();
		one.run(345,"king kohali",56);
		one.price = 345;
		one.Company= "Ferrari:";
		one.color = "blue";
		
		//method repair
		Cars.repair(65,909,"Hitman Rohit");
		
		
		
		
	}

}

class Cars 
{
	double price;
	String Company;
	String color;
	
	public void run(int i,String s,int j) //method signature
	{
		System.out.println("Cars are runs smoothly:");
		System.out.println(i+j);
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
	}
	
	public static void repair(int n,int m,String p) // method signature
	{
		System.out.println("reapiring cars are so hard");
		System.out.println(n%m);
		System.out.println(p.toUpperCase());
		System.out.println(p.length());
	}
	
	public Cars() // constructor
	{
		System.out.println("pravin jadhav king in the north");
	}
}
