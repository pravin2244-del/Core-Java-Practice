package HashMapLogicBaseCodes;

import java.util.HashMap;

public class SplitStringsInCapitalOrSmall {
	
	public static void main(String[] args)
	{
		String s ="ABC abc ABC abc";
		
		//{A=2,B=2,C=2,a=2,c=2,b=2}
		//{ABC=2,abc=2}
		
		String[] arr = s.split(" ");
		HashMap<String,Integer> mp = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				int freq = mp.get(arr[i])+1;
				mp.put(arr[i], freq);
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}
		
		System.out.println(mp);
		}

}
