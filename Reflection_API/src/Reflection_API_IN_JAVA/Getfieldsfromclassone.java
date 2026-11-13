package Reflection_API_IN_JAVA;

import java.lang.reflect.Field;

public class Getfieldsfromclassone {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class<?> clas = Class.forName("Reflection_API_IN_JAVA.SevenKingdoms");
		
		Field[] fd = clas.getDeclaredFields();
		
		for(int i=0;i<fd.length;i++)
		{
			System.out.println(fd[i]);
		}
		
		System.out.println("******************");
		System.out.println(fd.length);
		System.out.println("***********************");
	}

}

class SevenKingdoms

{
	String king = "Amend_Targerian";
	
	int Dragons = 24;
	
	public static void battle()
	{
		System.out.println("A true king always ready for the battle");
	}
	
	private SevenKingdoms(String name)
	{
		
	}
}
