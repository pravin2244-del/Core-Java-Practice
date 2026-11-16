package FunctionalInterface;

import java.util.function.BiFunction;

public class Bifunctionone {
	//BiFunction<T,U,R>
	public static void main(String[] args)
	{
		BiFunction<String,String,Integer> bi = (s1,s2)->{return s1.length()+s2.length();};
		
		System.out.println(bi.apply("kind","hitman"));
	}
	

}
