package Abstraction;

public class Multipleinterfacesimplement {
	public static void main(String[] args)
	{
		I_python stud = new Stud();
		stud.addmission();
		stud.termination();
		stud.simple();
		stud.hard_work();
	}

}

interface I_course
{
	
	
	int num = 100; //final static int num=100;
	// Abstract method/public method
	public void addmission();
	
	// default method
	default public void termination()
	{
		System.out.println("termination means out to my company");
	}
	default void simple()
	{
		System.out.println("pythinit is most simple language in the world");
	}
	
}

interface I_java extends I_course
{
	// abstract and public method
	public void hard_work();
	
	public void addmission();
}


interface I_python extends I_java
{
	default void simple()
	{
		System.out.println("pythinit is most simple language in the world");
	}
}

class Stud implements I_course,I_java,I_python
{

	@Override
	public void hard_work() {
	  System.out.println("java wants effforts");
		
	}

	@Override
	public void addmission() {
		System.out.println("I take addmission in java fullstatck");
	}
	
}