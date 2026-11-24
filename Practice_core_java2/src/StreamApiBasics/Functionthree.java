package StreamApiBasics;

import java.util.List;
import java.util.function.Function;

public class Functionthree {
	
	public static void main(String[] args)
	{
		Function<Integer,Integer> fun = (i)->{return i*i;};
		
		List<Integer> list = List.of(12,10,8,5,4,3,22);
		
		for(Integer i:list)
		{
			System.out.println(fun.apply(i));
		}
		
	}

}
