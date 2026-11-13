package Reflection_API_IN_JAVA;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetProperFieldsfromclass {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Library");
		
		Constructor<?> cons = cls.getDeclaredConstructor(int.class,String.class);
		
		cons.trySetAccessible();
		
		Object obj = cons.newInstance(127,"pune");
		
		
		
        Method m = cls.getDeclaredMethod("shopping", String.class);
		
		m.trySetAccessible();
	
		m.invoke(obj,"Mumbai");
		
		
		Field f = cls.getDeclaredField("district");
		
		f.trySetAccessible();
		System.out.println(f.get(obj));
		f.set(obj, "amravati");
		System.out.println(f.get(obj));
		
		
		
		//System.out.println(obj);
		
		
	}
	
}

class Library
{
	
	private Library(int i ,String s)
	{
		System.out.println(i+s.length());
		System.out.println("***********************");
	}
	
	private void shopping(String city)
	{
		System.out.println("I want to go shopping:"+city);
	}
	
	private String district = "pune";
}
