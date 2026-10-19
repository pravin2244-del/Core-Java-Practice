package StreamApiBasics;

import java.util.function.Function;

public class FunctionInJava {
	
	public static void main(String[] args)
	{
		Function<String,String> fun = (s)->{return s.toUpperCase();};
		
		
		System.out.println(fun.apply("pune"));
		
	}

}
