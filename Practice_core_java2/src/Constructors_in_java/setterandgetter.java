package Constructors_in_java;

public class setterandgetter {
	public static void main(String[] args)
	{
		
		Movie mov = new Movie();
		
		
		mov.setMovie_Name("padmavat");
		
		System.out.println(mov.getMovie_Name());
		
		mov.setDirector_Name("sanjayleela");
		
		System.out.println(mov.getDirector_Name());
		
		
		
	}

}

class Movie
{
	 String movie_name;
	String director_name;
	int released_year;
	
	public void shouting()
	{
		System.out.println("every film shout everyday");
	}
	
	public void setMovie_Name(String sm)
	{
		if(sm.length()<=8)
		{
			this.movie_name = sm;
			//this.director_name = sm;
			
			
		}
	}
	
	public String getMovie_Name()
	{
		return this.movie_name;
		//return this.director_name;
	}
	
	public void setDirector_Name(String dm)
	{
		if(dm.length()>8)
		{
			this.director_name = dm;
		}
	}
	
	public String getDirector_Name()
	{
		return this.director_name;
	}
	
	public Movie()
	{
		
	}
	
	
	
}
