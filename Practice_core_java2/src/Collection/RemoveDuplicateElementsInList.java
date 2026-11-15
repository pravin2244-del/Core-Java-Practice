package Collection;

import java.util.HashSet;

import java.util.List;

public class RemoveDuplicateElementsInList {
	
	public static void main(String[] args)
	{
		
		
		List<Integer> list = List.of(2,2,3,3,4,4,6,7,9,11,5);
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.addAll(list);
		
		System.out.println(set);
		
		
		
		
	}

}
