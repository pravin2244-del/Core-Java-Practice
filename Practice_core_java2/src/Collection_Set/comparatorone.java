package Collection_Set;

 import java.util.Comparator;
import java.util.TreeSet;

public class comparatorone {
	
	public static void main(String[] args)
	{
		TreeSet<Book> tree = new TreeSet<Book>(new PageComparator());
		
		tree.add(new Book(23,456.2));
		tree.add(new Book(25,435));
		tree.add(new Book(54,876.3));
		tree.add(new Book(53,654.3));
		
		System.out.println(tree);
		
		
		
	}

}

class Book
{
	int page;
	double price;
	
	public Book(int page,double price)
	{
		super();
		this.page = page;
		this.price = price;
		
	}
	
	public String toString()
	{
		return this.page+" "+this.price;
	}
}

class PageComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		System.out.println("@");
		return Integer.compare(o1.page, o2.page);
	}
	
}

class PriceComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		System.out.println("*");
		return Double.compare(o2.price,o1.price);
	}
	
}
