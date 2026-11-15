package Collection;

import java.util.Vector;

public class Vectorclasscode {
	
	public static void main(String[] args)
	{
		
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(23);
		vec.add(25);
		vec.add(54);
		vec.add(null);
		vec.add(23);
		vec.addElement(78);
		System.out.println(vec);
		vec.get(4);
		
		
		System.out.println(vec);
		
	}

}
