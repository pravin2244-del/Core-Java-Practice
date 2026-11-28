package Contract;

public class Equalitycheck {
	public static void main(String[] args)
	{
		Animal animal = new Animal(100,"Lion");
		Animal animal2 = new Animal(100,"Lion");
		System.out.println(animal==animal2);// it checks memory address or memory reference
		System.out.println(animal.equals(animal2));//  by default .equals()  also check reference of memory until is Oveeride to String Class then it checks contain
		
	}

}

class Animal
{
	int id;
	String name;
	
	public Animal(int id,String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
}
