package Polymorphism;

public class Methodoverloading {
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.add(23,45);
		//cal.mul("Maratha",96,1);
		
	}

}

class Calculator
{
	public void add(int i,int j)// method overloading focus on method signature mostly
	{
		System.out.println(i+j);
	}
	
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	
	/**public void mul(int i,int j)
	{
		System.out.println(i*j);
	}
	public void mul(String i,int j,int k)
	{
		System.out.println(i+j*k);
	} */
}

