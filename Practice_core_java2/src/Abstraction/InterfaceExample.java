package Abstraction;

public class InterfaceExample {
	
	public static void main(String[] args)
	{
	I_demo_2 one = new Calculater();
	
	one.add(12,43);
	one.sub("xYZ");
    one.run();
		
	}

}

interface I_demo
{
	 void add(int i,int j); // this method is abstarct method and its access modifier is public 
	 void sub(String s); // inside interface all methods are default and public
	 
}

interface I_demo_2 extends I_demo
{
	 void run();
}

class Calculater implements I_demo_2
{

	@Override
	public void run() {
		System.out.println("Every methods are runs inside class or interface:");	
	}
	
	public void add(int i,int j)
	{
		System.out.println("Addition is most important function inside the calus");
	}
	
	public void sub(String s)
	{
		System.out.println("Substraction is one the most important function in the  ");
	}
	
	
	
	
}
