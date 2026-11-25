package StreamApiBasics;

import java.util.List;
import java.util.function.Function;

public class StringtoIntegerByfunction {
	
	public static void main(String[] args)
	{
		
		List<String> list= List.of("pravin","abhishek","nit","avi");
		Function<String,Integer> fun = (i)->i.length();
		
		Function<String,Integer> fun2 = fun.andThen((j)->{return j*j;});
		
		for(String s:list)
		{
			System.out.println(fun2.apply(s));
		}
		
		//System.out.println(fun2.apply("king"));
		
		
	}

}
