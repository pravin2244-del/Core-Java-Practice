package StreamApIOperations;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethodInCollector {
	
	public static void main(String[] args)
	{
		
		String s = List.of("john","snow","java","Developer")
		.stream()
		.map((i)->(new StringBuffer(i)))
		.map((i)->(i.reverse()))
		.map((i)->(i.toString()))
		.collect(Collectors.joining(" "));
		
		System.out.println(s);
		
	}

}
