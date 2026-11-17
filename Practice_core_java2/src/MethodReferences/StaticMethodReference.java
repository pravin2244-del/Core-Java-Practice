package MethodReferences;

import java.util.List;

public class StaticMethodReference {
	//java 8
	public static void main(String[] args)
	{
		/**
		 * :: -> scope operator
		 * 
		 */
	
		List.of(12,11,4,55,44,33,333)
		.stream()
		.filter(Demo::check)
		.forEach(Demo::consume);
	}

}

class Demo
{
	public static boolean check(int i)
	{
		return i%2==0;
	}
	
	public static void consume(int i)
	{
		System.out.println(i);
	}
}
