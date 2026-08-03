package Practice_with_java;

public class Relationofstaticandinstancesone {
	
public static void main(String[] args)
{
	Movies ones = new Movies();
	ones.Actor_name = "Ramcharan";
	ones.Movie_name = "Ramayan";
	Movies.Director_name = "Rajamouli";
	
	System.out.println(ones.Actor_name);
	System.out.println(Movies.Director_name);
	Movies.Editing();
	ones.shooting();
	Movies.Director_name = "Martil Guptil";
	System.out.println(Movies.Director_name);
	
	
	Movies two = new Movies();
	two.Movie_name = " bahubali";
	two.Actor_name = "Prabhas";
	Movies.Director_name = "Raljamouli";
	
	System.out.println(two.Actor_name);
	System.out.println(Movies.Director_name);
	Movies.Editing();
	
}

}

class Movies
{
    String  Movie_name;
	static String Director_name = "Rajamouli";
	String Actor_name;
	
	public void shooting()//instance method 
	{
		System.out.println(Director_name);// static variable
		System.out.println("Everyday we shoot eight hours");
	}
	
	public static void Editing() // static method
	{
		//System.out.println( Movie_name); // insatnces variable 
		System.out.println("we have two talented editors to edit movie:");
	}
	
	
	
}
