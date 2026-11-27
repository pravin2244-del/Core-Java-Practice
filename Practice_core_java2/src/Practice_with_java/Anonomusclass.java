package Practice_with_java;

public class Anonomusclass {
	public static void main(String[] args)
	{
		I_animal animal = new I_animal(){
			
			public void run()
			{
				System.out.println("fast and furious");
			}
			
			public void eat()
			{
				System.out.println("vegeterian");
			}
			
			public int maxspeed()
			{
				return 198;
			}
		};
		
		animal.eat();
		animal.run();
		System.out.println(animal.maxspeed());
	}

}

interface I_animal
{
	void run();
	void eat();
	int maxspeed();
}