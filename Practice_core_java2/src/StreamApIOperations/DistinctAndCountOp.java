package StreamApIOperations;

import java.util.List;

public class DistinctAndCountOp {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(2,3,2,3,4,4,5,7,8,7,6,5,6,5,9,9);
		
		long l = list.stream()
		.distinct()
		//.forEach((i)->{System.out.println(i);});
		.count();
		System.out.println(l);
	}

}
