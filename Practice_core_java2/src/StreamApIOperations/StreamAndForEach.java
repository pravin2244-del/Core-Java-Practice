package StreamApIOperations;

import java.util.List;

public class StreamAndForEach {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(12,33,2,54,12,34,67);
		
		list.stream()
		.forEach((i)->{System.out.println(i);});//Terminal function
		
		
	}

}
