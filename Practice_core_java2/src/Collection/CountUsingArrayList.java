package Collection;
import java.util.ArrayList;
//import java.util.List;
//import java.util.LinkedList;

public class CountUsingArrayList {
	
	public static void main(String[] args)
	{
	
	ArrayList<Character> arr = new ArrayList<Character>();
	
	arr.add('a');
	arr.add('b');
	arr.add('a');
	arr.add('b');
	arr.add('c');
	arr.add('d');
	
	System.out.println(arr);
	for(int i=0;i<arr.size();i++)
	{
		char p = arr.get(i);
		int counter = 0;
		
		for(int j=0;j<arr.size();j++) 
		{
			if(arr.get(j)==p)
			{
				counter++;
			}
		}
		
		System.out.println(p+":"+counter);
	}
	
}

}

