package Collection_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparesIntegerByComparator {
	
	public static void main(String[] args)
	{
		TreeSet<Integer> set = new TreeSet<Integer>(new Reverse());
		
		set.add(45);
		set.add(18);
		set.add(77);
		set.add(93);
		
		System.out.println(set);
	}

}

class Reverse implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1,o2);
	}
	
}
