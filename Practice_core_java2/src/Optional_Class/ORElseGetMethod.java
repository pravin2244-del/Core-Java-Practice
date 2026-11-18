package Optional_Class;

import java.util.Optional;

public class ORElseGetMethod {
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable(null);
		
		System.out.println(ops);
		
		System.out.println(ops.orElseGet(()->{return new String("delhi");}));
	}

}
