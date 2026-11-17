package MethodReferences;

import java.util.List;

public class StaticMethodReferencetwo {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(12,11,22,33,44,55);
		
		list.stream()
		.filter(Pro::check)//pred 
		.map(Pro::multiply)//function
		.forEach(Pro::consume);//consumer

}
		
}
class Pro
{
	public static boolean check(int i)
	{
		return i%2==0;
	}
	
	public static void consume(int i)
	{
		System.out.println(i);
	}
	
	public static int multiply(int i)
	{
		return i*2;
	}
}


