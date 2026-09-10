package Contract;

import java.util.Objects;

public class ContractEqualsWithHashcode {

	public static void main(String[] args)
	{
		Book b1 = new Book(100,"java");
		Book b2 = new Book(100,"java");
		
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		//System.out.println(b1.equals(b2));
		
		
	}
}

class Book
{
	int price;
	String name;
	
	public Book(int price,String name)
	{
		super();
		this.price = price;
		this.name = name;
		
	}
	
	public int hashCode()
	{
		return Objects.hash(this.price,name);
	}
	
	public boolean equals(Object obj)
	{
		Book b = (Book)obj;
		return this.price == b.price && this.name.equals(b.name);
	}
}