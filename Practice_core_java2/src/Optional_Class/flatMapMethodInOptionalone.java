package Optional_Class;

import java.util.Optional;

public class flatMapMethodInOptionalone {
	
	public static void main(String[] args)
	{
		Optional<Integer> ops = Optional.ofNullable(121);
		System.out.println(ops);
		
		Optional<Integer> ops2 = ops.flatMap((i)->{return Optional.of(i.reverse(10));});
		
		
		System.out.println(ops2);
	}

}
