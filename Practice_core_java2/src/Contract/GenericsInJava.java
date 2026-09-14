package Contract;

public class GenericsInJava {
	public static void main(String[] args)
	{
		I_calculator<String , String> i = new One();
		System.out.println(i.calc("pravin", "Jadhav"));
	}

}

interface I_calculator<T,R> //here R is return type of method and T is type of parameter
{
	public R calc(T t1, T t2);
}

class One implements I_calculator<String,String>
{
	public String calc(String s,String s2)
	{
		
		return s+s2;
	}
}
