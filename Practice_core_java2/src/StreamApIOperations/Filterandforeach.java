package StreamApIOperations;

import java.util.List;

public class Filterandforeach {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(11,22,33,44,13,14,77,67);
		
		list.stream().filter((i)->{return i>40;}).forEach((i)->{System.out.println(i);});  
		
	}

}
