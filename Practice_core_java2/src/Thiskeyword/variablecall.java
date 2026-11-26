package Thiskeyword;

public class variablecall {
	public static void main(String[] args)
	{
		Movie first = new Movie(1,"Ramayan","malhotra");
		
		System.out.println(first.id);
		System.out.println(first.name);
		
		System.out.println(first.director);
		
		
	}

}

class Movie
{
	int id;
	String name;
	String director;
	
	public Movie(int id,String name,String director)
	{
		this.id = id;
		this.name = name;
		
		this.director = director;
		
		this.shooting();
		
	}
	public  void shooting()
	{
		System.out.println("shooting is just a timepass");
	}
	
}