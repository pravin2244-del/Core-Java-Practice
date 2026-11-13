package Reflection_API_IN_JAVA;

import java.lang.reflect.Field;

public class Getfieldsfromclass {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class<?> cls = Class.forName("Reflection_API_IN_JAVA.Students");
		
		Field[] fields = cls.getDeclaredFields();
		
		System.out.println(fields.length);
		
		for(int i=0;i<fields.length;i++)
		{
			System.out.println(fields[i]);
		}
	}

}


class Students
{
	public String name;
	
	int id;
	
	static String address;
	
}