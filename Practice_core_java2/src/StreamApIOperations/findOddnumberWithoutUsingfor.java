package StreamApIOperations;

import java.util.stream.IntStream;

public class findOddnumberWithoutUsingfor {
	
	public static void main(String[] args)
	{
		
		IntStream.rangeClosed(1, 200)
		.filter((i)->{return (i%2!=0);})
		.forEach((i)->{System.out.println(i);});
		
	}

}
