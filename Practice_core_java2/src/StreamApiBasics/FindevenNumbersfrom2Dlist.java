package StreamApiBasics;

import java.util.List;
import java.util.function.Consumer;

public class FindevenNumbersfrom2Dlist {
	
	public static void main(String[] args)
	{
        List<Integer> l1 = List.of(12,22,33,14,32,233,43,2,4,4);
		
		List<Integer> l2 = List.of(1167,2293,3322,22345,44,33,222,3333);
		
		List<Integer> l3 = List.of(10,20,66,55,666,55,44,444);
		
		List<List<Integer>> l4 = List.of(l1,l2,l3);
		
		System.out.println(l4);
		
		Two_d t = new Two_d();
		
		t.accept(l4);
		
		
		
	}

}

class Even_Number implements Consumer<List<Integer>>
{
	public void accept(List<Integer> t)
	{
		for(int i=0;i<t.size();i++)
		{
			if(t.get(i)%2==0)
			{
				System.out.println(t.get(i));
			}
		}
	}
}

class Two_d implements Consumer<List<List<Integer>>>
{
	Even_Number nums = new Even_Number();

	@Override
	public void accept(List<List<Integer>> t) {
		
		for(int i=0;i<t.size();i++)
		{
			nums.accept(t.get(i));
			System.out.println("------------------------------");
		}
		
	}
	
}