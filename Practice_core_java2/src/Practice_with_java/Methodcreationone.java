package Practice_with_java;

public class Methodcreationone {
	public static void main(String[] args)
	{
		Movie first = new Movie();
		first.movie_name = "avengers Infinity";
		first.realesed_year = 2019;
		first.actor_name = "crish hemsworth";
		
		first.Adevertise();
		
	}

}
class Movie {
	String movie_name;
	int realesed_year;
	String actor_name;
	int budget;
	
	public void Adevertise()
	{
		System.out.println("Advertise makes a movies blockbuster");
	}
}
