package Collection_Set;

import java.util.HashSet;

public class UniqueElementsaddsonly {
	
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("abc");
		
		set.add(new String("abc"));// does not add this element
		
		set.add("Xyz");
		
		System.out.println(set);
		
		System.out.println(set.size());
	}

}
