package StreamApIOperations;

import java.util.List;

public class FlatMapOperationone {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(2,20,200,1,10);
		
		List<Integer> list1 = List.of(3,22,20,1,100);
		
		List<List<Integer>> list3 = List.of(list,list1);
		
		System.out.println(list3);
		
		list3.stream()
		.flatMap((i)->i.stream())
		.map((i)->(i+2/2))
		.forEach((i)->{System.out.println(i);});
		
		
	}

}
