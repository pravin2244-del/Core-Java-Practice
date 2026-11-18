package Optional_Class;

import java.util.Optional;

public class ispresentmethod {
	
	static String name = "King";
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable(name);
		
		System.out.println(ops);
		
		if(ops.isPresent())
		{
			//System.out.println("no value is present");
			System.out.println(ops.get().toUpperCase());
		}
		
		else
		{
			
			System.out.println("no value is present");
		}
	}

}
