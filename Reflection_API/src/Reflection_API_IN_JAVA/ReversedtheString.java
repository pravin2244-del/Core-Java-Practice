package Reflection_API_IN_JAVA;

import java.lang.reflect.Field;

public class ReversedtheString {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Book");
		
		Field f = cls.getDeclaredField("name");
		
		f.setAccessible(true);
		
		//System.out.println(f.get(null));
		
		String str = (String)f.get(null);
		
		if(str.length()>10)
		{
			String reversed = new StringBuilder(str).reverse().toString();
			
			System.out.println(reversed);
		}
		else
		{
			System.out.println(str);
		}
		
		
	}

}

class Book
{
	private static String name = "Shyamchi_Aai";
	
}
