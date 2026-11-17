package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class first {
	
	public static void main(String[] args)
	{
		Map<String,String> mp = new LinkedHashMap<String,String>();
		
		mp.put("abc", "111111");
		mp.put(new String("abc"),"222222");
		
		mp.put("cde", null);
		
		System.out.println(mp);
		
		System.out.println(mp.containsValue("22222222"));
		
		System.out.println(mp.containsKey("abc"));
		
		
		
	}

}
