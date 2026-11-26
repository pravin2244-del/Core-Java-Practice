package StreamApIOperations;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamFilterandForEach {
	
	public static void main(String[] args)
	{
		Consumer<Integer> cons = (i)->{System.out.println(i);};
		
		Predicate<Integer> pred = (i)->{return i%2==0;};
		
		List<Integer> list = List.of(10,11,12,13,14,15);
		
		list.stream()
		.filter(pred) //Intermediate
		.forEach(cons);
	}

}
