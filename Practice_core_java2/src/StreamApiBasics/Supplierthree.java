package StreamApiBasics;

public class Supplierthree {
	
	public static void main(String[] args)
	{
		Supplier<String> sup = ()->{return new String("abcd234");};
		
		System.out.println(sup.get());
	}

}

interface Supplier<T>
{
	T get();
}
