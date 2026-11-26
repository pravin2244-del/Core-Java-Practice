package StreamApIOperations;

import java.util.List;

public class StreamFilterandForEachone {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(20,45,35,76,55,89);
		
		list.stream()
		.filter((i)->{return i>40;})
		.forEach((i)->{System.out.println(i);});
	}

}
