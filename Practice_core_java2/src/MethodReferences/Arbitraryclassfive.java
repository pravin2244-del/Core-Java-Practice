package MethodReferences;

import java.util.List;

public class Arbitraryclassfive {
	
	public static void main(String[] args)
	{
		int  k = List.of(111,112,113,1112,22,3333,333)
		
		.stream()
		.min((i,j)->(Integer.compare(i,j))).get();
		
		System.out.println(k);
		
	}

}
