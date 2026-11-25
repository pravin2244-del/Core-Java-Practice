package StreamApiBasics;

public class Predicatefour {
	
	public static void main(String[] args)
	{
		Predicate<Integer> pred = (t)->{return t%2==0;};
		
		System.out.println(pred.test(24));
	}

}

interface Predicate<T>
{
	boolean test(T t);
}
