package StreamApiBasics;

public class LambdaGenericsIncustomone {
	
	public static void main(String[] args)
	{
		I_Demo<String,Cycle> demo = (i1,i2)->{return new Cycle(i1,i2);};
		
		System.out.println(demo.study("king","North"));
	}

}

interface I_Demo<T,R>
{
	R study(T t1,T t2);
}

class Cycle
{
	public Cycle(String i,String j)
	{
		System.out.println("*********************");
	}
}
