package LinkedHashMap;

import java.util.LinkedHashMap;

public class second {
	
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> mp = new LinkedHashMap<Integer,String>();
		
		mp.put(12,"abc");
		mp.put(78, "xyz");
		
		//System.out.println(mp.putFirst(79,null));
		
		System.out.println(mp);
		
		//System.out.println(mp.lastEntry());
		
		//System.out.println(mp.pollFirstEntry());
		
	}

}
