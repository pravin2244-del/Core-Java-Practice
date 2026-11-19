package StreamApIOperations;

import java.util.List;

public class MapMethod {
	
	public static void main(String[] args)
	{
		List<String> list = List.of("aking","ahitman","jassi","swingKing","ajinkya");
		
		list.stream()
		.filter((i)->{return i.startsWith("a");})
		.peek((i)->{System.out.println(i+"*");})
		//.map((i)->{ return i.length();})
		
		.map((i)->{return i.toUpperCase();})
		.forEach((i)->{System.out.println(i);});
	}

}
