package Contract;

public class EqualitycheckByOverridingEquals {
	public static void main(String[] args)
	{
		Wildanimal animal = new Wildanimal(100,"tiger");
		Wildanimal animal2 = new Wildanimal(100,"tiger");
		System.out.println(animal==animal2);// it checks memory address or memory reference
		System.out.println(animal.equals(animal2));// in this code it checks content of object not a memory adress because we ovveriddes equals method from Object class
	}

}

class Wildanimal
{
	int id;
	String name;
	
	public Wildanimal(int id,String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj)
	{
		Wildanimal animal = (Wildanimal)obj;
	    return this.id==animal.id && this.name.equals(animal.name);
	}
}