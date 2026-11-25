package StreamApiBasics;

import java.util.function.Predicate;

public class PredicateInjavatwo {
	
	public static void main(String[] args)
	{
		Predicate<Integer> prod = (t)->{return t>100;};
		
		Predicate<Integer> prod2 = prod.and((t)->{return t>1000;});//It compares both the condition
		
		System.out.println(prod2.test(2000));
		
		
	}

}
