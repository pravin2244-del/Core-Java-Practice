package collectionQueque;

import java.util.ArrayDeque;

//import java.util.PriorityQueue;

public class Methodsinqueue {
	
	public static void main(String[] args)
	{
		ArrayDeque<Integer> arq = new ArrayDeque<Integer>();
		
		arq.add(12);
		arq.add(23);
		arq.add(34);
		arq.add(56);
		arq.add(77);
		
		System.out.println(arq);
		
		
		System.out.println(arq.poll());
		
		System.out.println(arq.peek());
		
		System.out.println(arq.offerFirst(100));
		System.out.println(arq);
		
		System.out.println(arq.remove());
		
		
		
	
		
	}

}
