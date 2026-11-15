package Collection_Set;

import java.util.HashSet;
import java.util.List;

public class Hashsetmethods {
	
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(11,22,11,44,33,22,33,44,543,2,2,3,3,33,3,1);
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.addAll(list);
		
		System.out.println(set);
		
		System.out.println(set.contains(543));
		
		System.out.println(set.containsAll(List.of(1,2,3,11)));
		
		System.out.println(set.removeAll(List.of(1,2,33)));
		
		System.out.println(set);
	}

}
