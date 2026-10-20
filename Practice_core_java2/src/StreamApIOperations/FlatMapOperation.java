package StreamApIOperations;

import java.util.List;

public class FlatMapOperation {
	
	public static void main(String[] args)
	{
		List<List<Integer>> list = List.of(List.of(12,23,24,10,11),List.of(3,2,7,9,8,5));
		
		List<List<Integer>> list1 = List.of(List.of(11,12,13,14,15),List.of(21,22,23,24,25));
		
		List<List<List<Integer>>> list3 = List.of(list,list1);
		
		System.out.println(list3);
		
		 list3.stream()
		.flatMap((i)->(i.stream()))
		.flatMap((i)->(i.stream()))
		.map((i)->(i*i))
		.forEach((i)->{System.out.println(i);});
		
		
	}

}
