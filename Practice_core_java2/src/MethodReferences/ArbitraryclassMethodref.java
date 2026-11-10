package MethodReferences;

import java.util.List;

public class ArbitraryclassMethodref {
	
	public static void main(String[] args)
	{
		 List.of("  abc  ","  ijkl ","king","north")
		.stream()
		.map(String::toUpperCase) //arbitrary class reference
		.map(String::trim)
		.forEach((System.out::println));
	}

}
