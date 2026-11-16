package HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashMapIncustomclass {
	
	public static void main(String[] args)
	{
		
		Movie movie = new Movie("RHDTM");
		Movie movie2 = new Movie("RHDTM");
		HashMap<Movie,String> map = new HashMap<Movie,String>();
		
		map.put(movie, "maddy");
		map.put(movie2, "Srk");
		
		System.out.println(map);
	}

}

class Movie
{
	String name;
	
	public Movie(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "name:"+name;
	}
	
	public int hashCode()
	{
		System.out.println("****************");
		return Objects.hash(this.name);
	}
	
	public boolean equals (Object obj)
	{
		System.out.println("------------------------------");
		Movie m = (Movie)obj;
		return this.name.equals(m.name);
	}
}
