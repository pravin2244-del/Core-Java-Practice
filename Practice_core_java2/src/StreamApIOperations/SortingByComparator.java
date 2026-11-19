package StreamApIOperations;

import java.util.List;

public class SortingByComparator {
	
	public static void main(String[] args)
	{
	    List<Integer> list = List.of(23,11,45,44,2,11,8,999);
	    
	    
	    list.stream()
	    .sorted((i,j)->{return Integer.compare(j, i);})
	    .forEach((i)->{System.out.println(i);});
	}

}
