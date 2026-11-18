package Optional_Class;


import java.util.Optional;

public class ifPresentmethodinoptional {
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable(null);
		System.out.println(ops);
		//if present
		ops.ifPresent((s)->{System.out.println(s.toUpperCase());});
		
		// ifPresentORElse
		ops.ifPresentOrElse((i)->{System.out.println(i.toUpperCase());},()->System.out.println("DEFAULT_VLAUE"));
		
		
		
	}

}
