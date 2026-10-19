package StreamApiBasics;

import java.util.List;
import java.util.function.Function;
public class Functionfive {
	
	public static void main(String[] args)
	{
		List<String> list = List.of("Bheem","Nakul","Sahadev","Kuru");
		
		Function<String ,Integer> fun = (s)->{return s.length();};
		
		Function<String,Integer> fun2 = fun.andThen((i)->{return i*i;});
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(fun2.apply(list.get(i)));
		}
	}

}
