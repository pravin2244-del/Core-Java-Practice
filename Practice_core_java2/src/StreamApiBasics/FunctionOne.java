package StreamApiBasics;

import java.util.function.Function;

public class FunctionOne {
	
	public static void main(String[] args)
	{
		Function<String,Integer> fun =(s)-> { return s.length();};
		
		System.out.println(fun.apply("allalslsksjdjsss"));
	}

}
