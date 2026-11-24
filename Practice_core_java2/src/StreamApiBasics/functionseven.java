package StreamApiBasics;

import java.util.function.Function;

public class functionseven {
	
	public static void main(String[] args)
	{
		Function<Object, Object> fun = Function.identity();
		
		System.out.println(fun.apply(200));
		
		
	}

}
