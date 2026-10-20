package StreamApIOperations;

import java.util.List;

public class chooseelementbylimit {
	
	public static void main(String[] args)
	{
		List<Integer> l1 = List.of(12,22,33,44,55,67,7,7);
		
		l1.stream()
		.sorted()
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
	}
}
	
	
