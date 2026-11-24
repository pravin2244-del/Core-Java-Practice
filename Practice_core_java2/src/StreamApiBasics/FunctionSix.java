package StreamApiBasics;

//import java.util.List;
import java.util.function.Function;

public class FunctionSix {
	
	public static void main(String[] args)
	{
			
		Function<String,Integer> fun = (i)->{return i.length();};
		
		Function<String,Integer> fun3 = fun.compose((i)->{
			
			System.out.println("**");
			return i.toUpperCase();});
		
		System.out.println(fun3.apply("pravin"));
		
		
	}

}
