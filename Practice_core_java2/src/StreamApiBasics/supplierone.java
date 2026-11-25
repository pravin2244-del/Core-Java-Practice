package StreamApiBasics;

import java.util.function.Supplier;

public class supplierone {

	public static void main(String[] args)
	{
		Supplier<Integer> sup = ()->{return 34;};
		
		System.out.println(sup.get());
	}
}
