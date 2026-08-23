package Polymorphism;

public class Changesreturntype {
	public static void main(String[] args)
	{
		Movies mov = new Bollywood();
		mov.makemovie();
		
		
	}

}

class Movies
{
	public Movies makemovie()
	{
		System.out.println("movie made");
		
		return new Movies();
	}
}
/** change of return type in child class is only possible in non-primitive return type
    if you used void or primitive return type in parent class you can not change return type of child class
    ovrride method **/
 
class Bollywood extends Movies
{
	public Bollywood makemovie()// here i changed Movies to Bollywood
	{
		System.out.println("movie made with advanced vfx");
		return new Bollywood(); // changes to Movies to Bollywood
	}
}

class hollywood extends Movies
{
	public hollywood makemovie()
	{
		System.out.println("charcters are bolds:");
		return new hollywood();
	}
}


