package StreamApIOperations;

import java.util.stream.IntStream;

public class FindEvenNumbersWithoutForloop {
	
	public static void main(String[] args)
	{
		 IntStream.rangeClosed(1, 100)
		.filter((i)->{return (i%2==0);})
		.forEach((i)->{System.out.println(i);});
	}

}
