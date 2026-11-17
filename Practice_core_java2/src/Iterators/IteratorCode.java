package Iterators;

import java.util.Iterator;
import java.util.List;

public class IteratorCode {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(11,22,22,44,55,66,55);
		
		System.out.println(list.size());
		
		System.out.println("************");
		
		/***for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}**/
		
		//this Iterator are work on all collection class
		Iterator<Integer> itr = list.iterator();
		
		//System.out.println(itr.hasNext());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
