package StreamApiBasics;

import java.util.List;
import java.util.function.Consumer;

public class FindevennumberUsingConsumer {
	
	public static void main(String[] args)
	{
		List<Integer> l1 = List.of(12,22,33,14,32,233,43);
		
		List<Integer> l2 = List.of(1167,2293,3322,22345,44,33,222,3333);
		
		Even_numbers even = new Even_numbers();
		
		even.accept(l1);
		
		System.out.println("==========================================");
		
		even.accept(l2);
		
		
		
		
	}

}

class Even_numbers implements Consumer<List<Integer>>
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
