package StreamApIOperations;

import java.util.List;
import java.util.stream.Collectors;

public class CountingInsideTheCollector {
	
	public static void main(String[] args)
	{
		//toList Method
		List<Integer> evens = List.of(11,22,12,33,44,66)
	    .stream()
	    .filter((i)->(i%2==0))
	    .collect(Collectors.toList());
		
		System.out.println(evens);
		System.out.println("=======================");
	    
		//Counting method
		long s = List.of("abcd","abcdef","xzy")
		.stream()
		.filter((i)->(i.length()>3))
		.collect(Collectors.counting()); // Terminal Method
		System.out.println(s);
				
		
		
	}

}
