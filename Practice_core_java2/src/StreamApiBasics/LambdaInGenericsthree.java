package StreamApiBasics;

public class LambdaInGenericsthree {
	
	public static void main(String[] args)
	{
		I_jungle<String> jung = (i,j)-> { System.out.println(i.toUpperCase()+":"+j.toUpperCase());
		
		};
		
		jung.display("Syrax", "caraxes");
		
		I_jungle<Integer> jung2 = (i,j)->{System.out.println(i+j);};
		
		jung2.display(45,18);
	}

}

interface I_jungle<T>
{
	void display(T i,T j);
}
