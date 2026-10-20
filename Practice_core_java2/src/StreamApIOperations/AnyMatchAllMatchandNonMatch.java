package StreamApIOperations;

import java.util.List;

//import java.util.List;

public class AnyMatchAllMatchandNonMatch {
	
	public static void main(String[] args)
	{
		boolean result = List.of(10,12,11,45,6,66,77,88,89)
		
		.stream()
		.noneMatch((i)->{return i>200;}); // terminal operation
				
		/*.stream()
		.anyMatch((i)->{return i>34;}); //Terminal */
				
		/*.stream()
		.allMatch((i)->{return i>25;});*/
		
		System.out.println(result);
	}

}
