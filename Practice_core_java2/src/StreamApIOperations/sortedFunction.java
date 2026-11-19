package StreamApIOperations;

import java.util.Comparator;
import java.util.List;

public class sortedFunction {
	
	public static void main(String[] args)
	{
		Comparator<Integer> com = (i,j)->{return Integer.compare(j,i);};
		
		List<Integer> list = List.of(10,23,35,76,45,4,55,4,2);
		
		list.stream()
		.sorted(com)//this function expects the lambda of comparator
		.forEach((i)->{System.out.println(i);});
	}

}
