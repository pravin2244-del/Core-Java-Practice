package MethodReferences;

import java.util.List;

public class StaticMethodReferenceone {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(12,3,44,5,44,1,2,33);
		
		list.stream()
		.filter(Dragons::check)
	
		.forEach(Dragons::con);
		
		
	}
	
}

class Dragons
{
	public static boolean check(int i)
	{
		return i%2!=0;
	}
	
	public static void con(int i)
	{
		System.out.println(i);
	}
}
