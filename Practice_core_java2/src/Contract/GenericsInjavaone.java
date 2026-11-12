package Contract;

public class GenericsInjavaone {
	
	public static void main(String[] args)
	{
		I_calculates<String,Integer,Integer> i = new Plus();
		System.out.println(i.calcy("raghav",100));
	}

}


interface I_calculates <T,R,U> // here R is return type ,T is type of parameter and U is another parameter
{
	public R calcy(T t1,U u1);
}

class Plus implements I_calculates<String,Integer,Integer>
{
	public Integer calcy(String s, Integer s2)
	{
		return s.length()+s2;
	}
}