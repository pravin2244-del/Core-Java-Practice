package MethodReferences;

import java.util.List;

public class ArbitraryclassMethodreftwo {
	
	public static void main(String[] args)
	{
		List.of("john","rob","sansa","arya")
		.stream()
		.map((i)->{ return new StringBuffer(i);})
		.map(StringBuffer::reverse)
		.forEach((i)->{System.out.println(i);});
	}

}
