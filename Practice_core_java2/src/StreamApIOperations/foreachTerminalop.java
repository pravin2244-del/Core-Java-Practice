package StreamApIOperations;

import java.util.ArrayList;
import java.util.List;

public class foreachTerminalop {
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		list.add(24);
		list.add(25);
		
		list.stream()
		.filter((i)->{return i%2==0;})
		.forEach((t)->{System.out.println(t);});
		
	}

}
