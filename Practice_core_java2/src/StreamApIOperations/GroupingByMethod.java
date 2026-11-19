package StreamApIOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethod {
	
	public static void main(String[] args)
	{
		Map<Object,List<String>> name = List.of("ajit","sneha","sujit","sweta","poo")
		
		.stream()
		.collect(Collectors.groupingBy((i)->(i.length())));
		
		System.out.println(name);
		
		
	}

}
