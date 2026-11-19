package StreamApIOperations;

import java.util.List;

public class Sortedfunctionone {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(1,2,3,4,5,6,7);
		
		list.stream()
		.sorted((i,j)->{return Integer.compare(j,i);}) //comparator lambda
		.forEach((i)->{System.out.println(i);});
	}

}
