package StreamApIOperations;

import java.util.List;

public class StringBufferOne {
	
	public static void main(String[] args)
	{
		List<String> list = List.of("john","rob","branden","Arya","sansa");
		
		list.stream()
		.map((i)->{return new StringBuffer(i);})
		.map((i)->{return i.reverse();})
		.forEach((i)->{System.out.println(i);});
	}

}
