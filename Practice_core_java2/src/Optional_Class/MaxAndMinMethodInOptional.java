package Optional_Class;

import java.util.List;
import java.util.Optional;

public class MaxAndMinMethodInOptional {
	
	public static void main(String[] args)
	{
		Optional<Integer> ops = List.of(12,23,44,55,5)
				.stream()
				//.min((i,j)->{ return Integer.compare(i, j);});
				.max((i,j)->{ return Integer.compare(i, j);});
		
		System.out.println(ops.get());
	}

}
