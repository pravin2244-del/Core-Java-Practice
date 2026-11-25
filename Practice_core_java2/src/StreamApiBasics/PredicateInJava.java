package StreamApiBasics;

import java.util.function.Predicate;

public class PredicateInJava {
	
	public static void main(String[] args)
	{
		//For Integer
		Predicate<Integer> pred =(t)->{return t%2==0;};
		
		System.out.println(pred.test(24));
		
		System.out.println(pred.test(11));
		
		//for string
		Predicate<String> pred2 =(t)->{return t.length()>10;};
		
		System.out.println(pred2.test("Greatness"));
	}

}
