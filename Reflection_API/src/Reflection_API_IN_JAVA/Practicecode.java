package Reflection_API_IN_JAVA;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Practicecode {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		Class cls = Class.forName("Reflection_API_IN_JAVA.Operating_system");
		
		Constructor<?> cons = cls.getDeclaredConstructor(int.class ,String.class);
		
		cons.trySetAccessible();
		
		Object obj = cons.newInstance(45,"Rohit");
		
		Method m = cls.getDeclaredMethod("Running",String.class);
		
		m.trySetAccessible();
		
		m.invoke(obj,"ditox");
		
		
		Field f = cls.getDeclaredField("name");
		
		f.trySetAccessible();
		System.out.println(f.get(obj));
		
		
		
		
		
		
	}
	
	

	
}

class Operating_system
{
	private int id;
	private String name;
	
	private Operating_system(int id,String name)
	{
		System.out.println(id+name.length());
		System.out.println("************");
	}
	
	private void running(String name)
	{
		System.out.println("windos is the best operating system");
	}
	
	
}
