package StreamApiBasics;

import java.util.function.Consumer;

public class ConsumersinJava {
	
	public static void main(String [] args)
	{
		Consumer<Integer> cons = (i)->{System.out.println(i*2);
		
		};
		
		
		Consumer<Integer> cons1 = cons.andThen((j)->{System.out.println(j*3);});
		
		cons.accept(100);
		
		cons1.accept(200);
		
		
		
		
		
	}

}
