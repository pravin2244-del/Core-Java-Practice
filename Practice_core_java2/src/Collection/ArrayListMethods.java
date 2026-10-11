package Collection;

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Virat");
		arr.add("Rohit");
		arr.add("Jasprit");
		arr.add("Hardik");
		arr.add("Surya");
		
		System.out.println(arr);
		
		System.out.println(arr.size());
		
		//System.out.println(arr.get(2));
		
		//System.out.println(arr.getLast());
		
		arr.add(3,"shreyash");
		System.out.println(arr);
		System.out.println(arr.size());
		
		arr.set(0, "Sachin");
		System.out.println(arr);
		System.out.println(arr.size());
		
		System.out.println(arr.contains("virat"));
		
		System.out.println(arr.contains("Rohit"));
		
		
		//System.out.println(arr.getFirst());
	}

}
