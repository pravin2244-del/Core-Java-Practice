package Collection;

import java.util.ArrayList;

public class ElementsAreContainsOrNot {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrr = new ArrayList<Integer>();
		
		//long start = System.nanoTime();
		
		for(int i=0;i<100000;i++)
		{
			arrr.add(i);
		}
		
		// long end = System.nanoTime();
		
		System.out.println(arrr.contains(79999));
		
	}


}
