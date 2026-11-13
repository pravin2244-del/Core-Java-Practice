package Reflection_API_IN_JAVA;

import java.lang.reflect.Constructor;

public class FindTheConstructorsone {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Cricket");
		
		//Constructor<?>[] constructor = cls.getConstructors();
		// it gives only public constructors
		
		Constructor<?>[] constructor = cls.getDeclaredConstructors(); // It givs public/private/protected or default all
		
		for(int i=0;i<constructor.length;i++)
		{
			System.out.println(constructor[i]);
		}
		
		System.out.println("===================================");
		
		System.out.println("Count:"+constructor.length);
		
		System.out.println("====================================");
	}

}

class Cricket
{
	public Cricket()
	{
		
	}
	
	public Cricket(String s)
	{
		
	}
	
	Cricket(int i,String j)
	{
		
	}
}