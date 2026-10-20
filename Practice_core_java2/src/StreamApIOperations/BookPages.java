package StreamApIOperations;

import java.util.ArrayList;
import java.util.List;

public class BookPages {
	
	public static void main(String[] args)
	{
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book("java",1000,"Nitesh_sir",400));
		list.add(new Book("python",100,"Abhishek_sir",40));
		list.add(new Book("chemistry",300,"Pradip_sir",500));
		list.add(new Book("physics",10,"pravin",300));
		
		System.out.println(list);
		
		list.stream()
		.filter((i)->{return i.pages>300;}).forEach((i)->{System.out.println(i);});
		
	}

}

class Book
{
	String name;
	int price;
	String author_name;
	int pages;
	
	public Book(String name,int price,String author_name,int pages)
	{
		super();
		this.name = name;
		this.price = price;
		this.author_name = author_name;
		this.pages = pages;
	}
	
	public String toString()
	{
		return "Name:" +name+ ",Price:" +price+ ",Author:" +author_name+ ",Pages:" +pages;
	}
	
}
