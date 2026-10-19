package StreamApiBasics;

import java.util.List;
import java.util.function.Consumer;

public class FindEvenNumFrom3dlist {
	
	public static void main(String[] args)
	{
		List<Integer> l1 = List.of(12,22,44,55,10,20,30);
		
		List<Integer> l2 = List.of(1,3,4,3,5,6,7,8,7,6,6);
		
		List<Integer> l3 = List.of(100,222,33,22,11,200);
		
	    List<Integer> l4 = List.of(23,22,11,434,44,5,57,9);
		
	    //System.out.println(l4);
		
	    List<List<Integer>> l5 = List.of(l1,l2,l3,l4);
	    
	    List<List<List<Integer>>> l6 = List.of(l5);
	    System.out.println(l6);
		
		Three_D t1 = new Three_D();
		
		t1.accept(l6);
	}

}

class Even implements Consumer<List<Integer>>
{

	@Override
	public void accept(List<Integer> t) {
		for(int i=0;i<t.size();i++)
		{
			if(t.get(i)%2==0)
			{
				System.out.println(t.get(i));
			}
		}
		
	}
	
}


class Twod implements Consumer<List<List<Integer>>>
{
	Even num = new Even();

	@Override
	public void accept(List<List<Integer>> t) {
		// TODO Auto-generated method stub
		for(int i=0;i<t.size();i++)
		{
			num.accept(t.get(i));
			System.out.println("============================================");
		}
	}
	
}

class Three_D implements Consumer<List<List<List<Integer>>>>
{
	Twod nums = new Twod();

	@Override
	public void accept(List<List<List<Integer>>> t) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<t.size();i++)
		{
			nums.accept(t.get(i));
			
			//System.out.println("======================================");
			
		}
	}
	
}
