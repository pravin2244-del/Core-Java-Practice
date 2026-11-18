package Optional_Class;

import java.util.Optional;

public class flatMapMethodInOptional {
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable("uttar");
		
		System.out.println(ops.flatMap((i)->{return Optional.of(i.toUpperCase());}));
	}

}
