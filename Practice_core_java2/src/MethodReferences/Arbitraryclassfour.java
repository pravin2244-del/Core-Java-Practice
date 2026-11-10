package MethodReferences;

import java.util.List;
import java.util.stream.Collectors;

public class Arbitraryclassfour {
	
	public static void main(String[] args)
	{
		List<String> list = List.of("cersi","tywin","tyrion","tyrol","tom","lan")
		.stream()
		.filter((i)->(i.startsWith("t")))
		.map(StringBuffer::new)
		.map(StringBuffer::reverse)
		.map(StringBuffer::toString)
		.collect(Collectors.toList());
		
		System.out.println(list);
	}

}
