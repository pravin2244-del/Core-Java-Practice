package Optional_Class;

import java.util.Optional;

public class filtermethodInOptional {
	
	public static void main(String[] args)
	{
		Optional<String> ops = Optional.ofNullable("nanded");
		
		System.out.println(ops.filter((i)->{ return i.length()>50;}));
	}

}
