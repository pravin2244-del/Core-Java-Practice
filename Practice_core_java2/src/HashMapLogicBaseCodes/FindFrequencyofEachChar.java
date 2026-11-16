package HashMapLogicBaseCodes;

import java.util.HashMap;

public class FindFrequencyofEachChar {
	
	public static void main(String[] args)
	{
		String s ="Pravin Anil Jadhav";
		String s2 = s.toLowerCase();
		String[] arr = s2.split(" ");
		
		String demo="";
		
		for(int i=0;i<arr.length;i++)
		{
			demo = demo+arr[i];
			
		}
		
		System.out.println(demo);
		
		char[] chars = demo.toCharArray();
		
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		 for(int i=0;i<chars.length;i++)
		 {
			 if(mp.containsKey(chars[i]))
			 {
				 int freq = mp.get(chars[i])+1;
				 
				 mp.put(chars[i],freq);
				 
			 }
			 else
			 {
				 mp.put(chars[i], 1);
			 }
		 }
		 
		 System.out.println(mp);
	}

}
