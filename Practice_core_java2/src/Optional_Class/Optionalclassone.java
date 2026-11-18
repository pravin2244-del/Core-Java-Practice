package Optional_Class;

import java.util.Optional;

public class Optionalclassone {
	
	static String name = "Satara";
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable(name);
		
		System.out.println(ops);
		
		if(ops.isEmpty())
		{
			System.out.println("no value is present");
		}
		
		else
		{
			System.out.println(ops.get().toUpperCase());
		}
	}

}
