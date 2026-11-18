package Optional_Class;

import java.util.Optional;

public class filtermethodInOptionalone {
	
	public static void main(String[] args)
	{
		Optional<Integer> ops = Optional.ofNullable(100);
		
		System.out.println(ops);
		
		System.out.println(ops.filter((i)->{return i.intValue()>200;}));
	}

}
