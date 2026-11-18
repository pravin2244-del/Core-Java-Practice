package Optional_Class;

import java.util.Optional;

public class ORElseThrow {
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable(null);
		
		ops.orElseThrow();
		
		System.out.println(ops);
				
	}

}
