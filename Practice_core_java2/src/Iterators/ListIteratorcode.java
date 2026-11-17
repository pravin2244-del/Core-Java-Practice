package Iterators;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorcode {
	
	public static void main(String[] args)
	{
		// this Iterator only work on List class
		
		List<Integer> list = List.of(11,22,3,4,555,66,77,88,88);
		
		ListIterator<Integer> itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**************");
		
		while(itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		}
	}

}
