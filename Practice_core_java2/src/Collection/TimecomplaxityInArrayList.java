package Collection;

import java.util.ArrayList;

public class TimecomplaxityInArrayList {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		long start = System.nanoTime();
		
		for(int i=0;i<100000;i++)
		{
			arr.add(i);
		}
		
		System.out.println(arr.get(503));
		
		long end = System.nanoTime();
		
		System.out.println("time:"+(end-start)/10000);
	}

}
