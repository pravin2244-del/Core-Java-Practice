package Collection;

import java.util.ArrayList;
//import java.util.List;
//import java.util.LinkedList;
public class SearchingtimeCheck {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//LinkedList<Integer> arr = new LinkedList<Integer>();
		
		
		
		long start = System.nanoTime();
		
		for(int i=0;i<100000;i++)
		{
			arr.add(i);
		}
		
		System.out.println(arr.get(49999));
		long end = System.nanoTime();
		
		System.out.println((end-start)/10000);
	}

}
