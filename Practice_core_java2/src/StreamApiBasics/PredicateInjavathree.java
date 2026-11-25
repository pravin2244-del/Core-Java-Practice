package StreamApiBasics;

import java.util.function.Predicate;

public class PredicateInjavathree {
	
	public static void main(String[] args)
	{
		Predicate<Integer> pred = (t)->{return t>500;};
		
		Predicate<Integer> pred2 =pred.or((t)->{return t>1000;});
		
		System.out.println(pred2.test(700));
	}

}
