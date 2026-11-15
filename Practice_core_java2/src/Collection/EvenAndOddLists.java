package Collection;

import java.util.ArrayList;
import java.util.List;
public class EvenAndOddLists {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(2,3,4,6,7,9,11,5);
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2 == 0)
			{
				even.add(list.get(i));
			}
			else
			{
				odd.add(list.get(i));
			}
		}
		
		System.out.println(list);
		System.out.println(even);
		System.out.println(odd);
	}

}
