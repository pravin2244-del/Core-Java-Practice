package StreamApiBasics;

public class LambdaInGenericsfour {
	
	public static void main(String[] args)
	{
		I_Forest<String,Integer> f = (i,a)->{System.out.println(i.length()+a);};
		
		f.display("white_wolf", 234);
	}

}

interface I_Forest<T,A >
{
	void display(T i,A j);
}
