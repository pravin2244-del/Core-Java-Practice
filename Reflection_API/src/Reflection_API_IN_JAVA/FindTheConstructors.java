package Reflection_API_IN_JAVA;

import java.lang.reflect.Constructor;

public class FindTheConstructors {
	
	public static void main(String[] args) throws ClassNotFoundException

	{
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Employee");
		Constructor<?> [] constructors = cls.getDeclaredConstructors();
		
		for(int i=0;i<constructors.length;i++)
		{
			System.out.println(constructors[i]);
		}
		
		System.out.println(constructors.length);
		
		System.out.println("------------------------------------");
	}

}

class Employee
{
	public Employee()
	{
		
	}
	
	public Employee(int i)
	{
	
	}
	
	private Employee(int i,int j)
	{
		
	}
}
