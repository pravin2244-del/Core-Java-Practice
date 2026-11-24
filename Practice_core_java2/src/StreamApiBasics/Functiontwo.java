package StreamApiBasics;

import java.util.List;
import java.util.function.Function;

public class Functiontwo {
	
	public static void main(String[] args)
	{
		Function<String,Integer> fun = (s)->{return s.length();};
		
		List<String> list = List.of("Pravin","arjun","sunil","karan");
		
		for(String s:list)
		{
			System.out.println(fun.apply(s));
		}
	}

}
