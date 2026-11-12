package collectionQueque;

import java.util.LinkedList;

public class LinkedListImplementsDeque {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> Ls = new LinkedList<Integer>();
		
		for(int i=0;i<100000;i++)
		{
			Ls.add(i);
		}
		
		long start = System.nanoTime();
		
		//Middle node requires more time than start node or end node
		
		//Middle node
		//System.out.println(Ls.get(50000));
		
		//start node
		
		//System.out.println(Ls.get(20));
		
		
		//end node
		System.out.println(Ls.get(99999));
		
		long end = System.nanoTime();
		
		System.out.println("time:"+(end-start)/10000);
		
	}

}
