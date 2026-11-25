package StreamApiBasics;

import java.util.function.Predicate;

public class PredicateInjavaone {
	
	public static void main(String[] args)
	{
		Predicate<Integer> prod = (t)->{return t>20;};
		
		Predicate<Integer> prod2 = prod.negate();//negate the condition
		
		System.out.println(prod.test(23));
		
		System.out.println(prod2.test(23));
	}

}
