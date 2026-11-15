package Collection;

import java.util.Stack;

public class StackclassCode {
	
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println(stack);
		
		System.out.println(stack.pop()); // it uses to remove the element
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); // search for specific index
		
		System.out.println(stack);
		
		System.out.println(stack.size()); // it checks the size
		
		stack.push(500);
		System.out.println(stack);
		System.out.println(stack.get(1));
	}

}
