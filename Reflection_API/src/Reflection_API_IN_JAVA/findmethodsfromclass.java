package Reflection_API_IN_JAVA;

import java.lang.reflect.Method;

public class findmethodsfromclass {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
       Class<?> mls = Class.forName("Reflection_API_IN_JAVA.school");
		
		Method[] methods = mls.getMethods();
		//Method[] methods = mls.getDeclaredMethods();
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i]);
		}
		
		System.out.println("==========================");
		System.out.println(methods.length);
		System.out.println("=======================");
	}

}

class school
{
	public void homework()
	{
		System.out.println("I do may work");
	}
	
	static String Exam(String s)
	{
		return s;
	}
	
	private int friends(int i)
	{
		return 23;
	}
}
