package Collection;

import java.util.ArrayList;

public class AddmissingElements {
	
	public static void main(String[] args)
	{
	  ArrayList<Integer> arrr = new ArrayList<Integer>();
	  
	  arrr.add(21);
	  arrr.add(22);
	  arrr.add(23);
	  arrr.add(30);
	  
	  System.out.println(arrr);
	  
	  int lowest = 21;
	  int highest =30;
	  
	  for(int i=0;i<arrr.size();i++)
	  {
		  
		 
		  if(arrr.get(i)>highest)
		  {
			  highest = arrr.get(i);
		  }
		  
		  if(arrr.get(i)<lowest)
		  {
			  lowest = arrr.get(i);
		  }
		 
		  

	  }
	  
	  System.out.println("higest:"+highest);
	  System.out.println("lowest:"+lowest);
	  
	  
	  for(int j=lowest;j<highest;j++)
	  {
		  if(!arrr.contains(j))
		  {
			  System.out.println(j);
		  }
		  
	  }
	}
}

