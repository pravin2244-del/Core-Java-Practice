package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashMapIncustomclassone {
	
	public static void main(String[] args)
	{
		HashMap<Staff,String> hmap = new HashMap<Staff,String>();
	    
		Staff staff = new Staff("clerk");
		
		Staff staff2 = new Staff("clerk");
		
		hmap.put(staff, "Rana");
		hmap.put(staff2, "Pathan");
		
		System.out.println(hmap);
		
	}

}

class Staff
{
  String designation;
  
  public Staff(String designation)
  {
	  this.designation = designation;
  }


public int hashCode()
{
	System.out.println("********************");
	return Objects.hash(this.designation);
}

public String toString()
{
	return "Designation:"+designation;
}

public boolean equals(Object obj)
{
	System.out.println("----------------------");
   Staff s = (Staff)obj;
   return this.designation.equals(s.designation);
}
}
