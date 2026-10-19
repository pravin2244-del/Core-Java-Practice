package StreamApiBasics;

import java.util.function.Function;

public class ComposeOperationInsideFunction {
	
	public static void main(String[] args)
	{
		Function<String,Integer> after = i->i.length();
		
		Function<String,Integer> fun2 = after.compose((i)->{return i.toUpperCase();});
		
		System.out.println(fun2.apply("pravin"));
	}

}
