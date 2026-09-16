package Collection;

import java.util.ArrayList;

public class checkcontains {
	public static void main(String[] args)
	{
		ArrayList<Book> arr = new ArrayList<Book>();
		
		arr.add(new Book("amrutvel",100));
		arr.add(new Book("shyamchi aai",200));
		
		System.out.println(arr);
		
		System.out.println(arr.contains(new Book("amrutvel",100)));
	}

}

class Book
{
	String name;
	double price;
	
	public Book(String name,double price)
	{
		this.name = name;
		this.price = price;
		
	}
	
	public String toString()
	{
		return this.name+"::"+this.price;
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("-------------------------------------------");
		
		Book b = (Book)obj;
		
		return this.name.equals(b.name) && this.price==b.price; 
	}
}


