package Collection_Set;

import java.util.TreeSet;

public class CompareCustomClassObjectCity {
	
	public static void main(String[] args)
	{
		TreeSet<City> tree = new TreeSet<City>();
		
		City first = new City("Pune",234);
		
		City second = new City("Mumbai",345);
		
		City third = new City("Winterfale",455);
		
		City four = new City("KingsLanding",432);
		
		tree.add(first);
		tree.add(second);
		tree.add(third);
		tree.add(four);
		
		System.out.println(tree);
		
		
	}

}

class City implements Comparable<City>
{
	String name;
    int population;
    
    public City(String name , int population)
    {
    	super();
    	
    	this.name = name;
    	this.population = population;
    }
    
    public String toString()
    {
    	return this.name+" "+this.population;
    }

	@Override
	public int compareTo(City o) {
		
		System.out.println("*");
		return this.name.compareTo(o.name);
	}
}
