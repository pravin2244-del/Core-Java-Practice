package StreamApIOperations;

import java.util.List;

public class StringBufferwithstream {
	
	public static void main(String[] args)
	{
		List<String> list = List.of("caraxes","vhager","dreamfire","vermithor");
		
		list.stream()
		.filter((i)->{return i.startsWith("v") || i.startsWith("d");})
		.map((i)->{return new StringBuffer(i);})
		.map((i)->{return i.reverse();})
		.forEach((i)->{System.out.println(i);});
	}

}
