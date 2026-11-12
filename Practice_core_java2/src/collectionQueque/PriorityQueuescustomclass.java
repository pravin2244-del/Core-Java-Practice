package collectionQueque;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuescustomclass {
	
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>(new Int_descending());
		
		pr.add(40);
		pr.add(40);
		pr.add(30);
		pr.add(20);
		pr.add(10);
		pr.add(50);
		pr.add(60);
		
		System.out.println(pr);
		
		System.out.println(pr.poll());
		System.out.println(pr.poll());
		
		System.out.println(pr.peek());
		
		System.out.println(pr.poll());
		
		System.out.println(pr.poll());
		
		
		
	}

}

class Int_descending implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return  Integer.compare(o2,o1);
	}
	
}
