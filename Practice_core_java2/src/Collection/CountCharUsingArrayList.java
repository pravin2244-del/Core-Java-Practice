package Collection;

//import java.util.ArrayList;
import java.util.List;
//import java.util.LinkedList;
public class CountCharUsingArrayList {
	
	public static void main(String[] args)
	{
		List<Character> array = List.of('a','b','c','d','e','a','b');
		for(int j=0;j<array.size();j++)
		{
			char k = array.get(j);
			
			int counter = 0;
			
			for(int l=0;l<array.size();l++)
			{
				if(array.get(l)==k)
				{
					counter ++;
				}
			}
			
			System.out.println(k+ ":"+counter);
			
			
		}
		
		//LinkedList<Integer> list = new LinkedList<Integer>();
		
	}
	
}
