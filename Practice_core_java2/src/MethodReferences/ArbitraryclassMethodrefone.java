package MethodReferences;

import java.util.List;

public class ArbitraryclassMethodrefone {
	
	public static void main(String[] args)
	{
		List.of("abcd","pqrs","lallaa","uttar")
		.stream()
		.map(String::toUpperCase)
		.forEach((j)->{System.out.println(j);});
	}

}
