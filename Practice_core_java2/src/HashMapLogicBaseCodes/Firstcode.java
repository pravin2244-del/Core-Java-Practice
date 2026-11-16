package HashMapLogicBaseCodes;

import java.util.HashMap;

public class Firstcode {
	
	public static void main(String[] args)
	{
		HashMap<String ,String> hm = new HashMap<String,String>();
		
		hm.put("abc","abc");
	    hm.put("abcd", "abc");
	    hm.put("abcde","abc");
	    hm.put("abcdefg", "abc");
	    //hashMap only count unique keys
	    System.out.println(hm .size());
	    
	    System.out.println(hm);
	    
	    System.out.println(hm.get(new String("abc")));
	    
	    //get method is used thed get the value which is asociated with specific key
		
	}

}
