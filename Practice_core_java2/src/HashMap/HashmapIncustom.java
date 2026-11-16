package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashmapIncustom {
	
	public static void main(String[] args)
	{
		
		Kingdom k = new Kingdom("Maratha_empire");
		
		Kingdom k1 = new Kingdom("Maratha_empire");
		
		HashMap<Kingdom,String> map = new HashMap<Kingdom,String>();
		
		
		map.put(k,"shivajimaharaj");
		
		map.put(k1, "shahuraje");
		
		System.out.println(map);
		
		
	}

}

class Kingdom
{
	String name;
	String King_name;
	
	public Kingdom(String name)
	{
		super();
		this.name = name ;
		
	}
	
	public int hashCode()
	{
		System.out.println("**************");
		return Objects.hash(this.name);
	}
	
	public String toString()
	{
		return "name:"+name;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("================================");
		Kingdom king = (Kingdom)obj;
		
		return this.name.equals(king.name);
	}
}
