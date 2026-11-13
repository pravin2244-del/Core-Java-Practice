package Reflection_API_IN_JAVA;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class GetProperstaticFields {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Mart");
		
		Method m = cls.getDeclaredMethod("display",String.class);
		
		m.trySetAccessible();
		
		m.invoke(null,"Jammu");
		
		Field f = cls.getDeclaredField("district");
		
		f.trySetAccessible();
		
		System.out.println(f.get(null));
		
		f.set(null,"nagpur");
		
		
		
	}
	
	
}

class Mart
{
	static String district = "kolhapur";
	
	private static void display(String city)
	{
		System.out.println("My favarite city is jaipur:" +city);
	}
	
}
	
	