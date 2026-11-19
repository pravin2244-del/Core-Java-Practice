package StreamApIOperations;

import java.util.List;
import java.util.stream.Collectors;

public class ReversedStringwithAPIOprations {
	
	public static void main(String[] args)
	{
		String s = List.of("abc","ijlk","elke","pune","mumbai","latur")
		
		.stream()
		.map((i)->(new StringBuffer(i)))
		.map((i)->(i.reverse()))
		.map((i)->(i.toString()))
		.collect(Collectors.joining("-"));
		
		System.out.println(s);
		
		
		
	}

}
