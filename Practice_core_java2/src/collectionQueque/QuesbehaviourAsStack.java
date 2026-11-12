package collectionQueque;

import java.util.ArrayDeque;

public class QuesbehaviourAsStack {
	
	public static void main(String[] args)
	{
		ArrayDeque<Integer> arqs = new ArrayDeque<Integer>();
		
		arqs.add(18);
		arqs.add(33);
		arqs.add(45);
		arqs.add(93);
		arqs.add(7);
		
		System.out.println(arqs);
		
		System.out.println(arqs.pollLast());
		
		System.out.println(arqs.offerLast(183));
		System.out.println(arqs);
		
		System.out.println(arqs.peekLast());
		
		System.out.println(arqs.removeLast());
		
		System.out.println(arqs.pollLast());
		
		
	}

}
