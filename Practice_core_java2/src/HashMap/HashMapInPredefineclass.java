package HashMap;

import java.util.HashMap;

public class HashMapInPredefineclass {
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Pune");
		map.put(2, "Mumbai");
		map.put(1, "Delhi");
		
		System.out.println(map);
		
		System.out.println(Integer.valueOf(1).equals(Integer.valueOf(1)));
		
		
	}

}
