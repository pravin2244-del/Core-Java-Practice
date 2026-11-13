package Reflection_API_IN_JAVA;

import java.lang.reflect.Method;

public class GetMethodsFromclass {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class<?> mls = Class.forName("Reflection_API_IN_JAVA.Student");
		
		//Method[] methods = mls.getMethods();
		Method[] methods = mls.getDeclaredMethods();
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i]);
		}
		
		System.out.println("==========================");
		System.out.println(methods.length);
		System.out.println("=======================");
		
	}

}

class Student 
{
	public void run()
	{
		System.out.println("you are running");
	}
	
	public int fight(int i)
	{
		return i;
	}
	
	private void battle()
	{
		System.out.println("I am the undefited:");
	}
}
