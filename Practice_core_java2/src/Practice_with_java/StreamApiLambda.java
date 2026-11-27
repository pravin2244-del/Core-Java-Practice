package Practice_with_java;

public class StreamApiLambda {
	
	public static void main(String[] args)
	{
		I_j i = (s1,s2)->{return s1.length()+s2.length();};
		
		System.out.println(i.demo("king", "Pravin"));
	}

}

interface I_j
{
	int demo(String s1,String s2);
}
