package StreamApiBasics;

import java.util.List;
import java.util.function.Function;

public class Functionfour {
	
	public static void main(String[] args)
	{
		Function<Integer,Integer> fun = (i)->{return i*i;};
		
		List<Integer> l = List.of(12,22,9,8,0,7);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(fun.apply(l.get(i)));
		}
		
	}

}
