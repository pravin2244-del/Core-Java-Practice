package StreamApiBasics;

public class FunctionInJavaeight {
	
	public static void main(String[] args)
	{
		Function<String, Integer> fun =(s)->{return s.length();};
		
		System.out.println(fun.apply("NorthRemembersWeKnownoKing"));
	}

}

interface Function<T,R>
{
	R apply(T t);
}