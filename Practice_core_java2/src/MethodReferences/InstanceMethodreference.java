package MethodReferences;

import java.util.List;

public class InstanceMethodreference {
	
	public static void main(String[] args)
	{
		Prime p = new Prime();
		
		List<Integer>list=List.of(10,8,70,66,12);
		list.stream()
		.filter(p::check)
		.map(p::multiply)
		.forEach(p::consume);
	}

}

class Prime
{
	public  boolean check(int i)
	{
		return i%2==0;
	}
	
	public  void consume(int i)
	{
		System.out.println(i);
	}
	
	public  int multiply(int i)
	{
		return i*2;
	}
}
