package StreamApiBasics;

public class LambdaINGenericsInJava {
	
	public static void main(String[] args)
	{
		I_gen<String,Integer> gen = (t1,t2)->{return t1.length()+t2.length();};
		
		System.out.println(gen.generate("abcd","abcde"));
		
		I_gen<String,Integer> gen2 = (t1,t2)->{return t1.length()+t2.length();};
	
		System.out.println(gen2.generate("King","Kohali"));
	
}
}
interface I_gen<T,R>
{
	R generate(T t1,T t2);
}
