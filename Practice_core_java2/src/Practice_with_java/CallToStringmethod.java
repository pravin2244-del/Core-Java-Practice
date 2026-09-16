package Practice_with_java;

public class CallToStringmethod {
	
	public static void main(String[] args)
	{
		Books book = new Books("Agnipankh",345);
		
		Books book1 = new Books("the history of marathas",454);
		
		
		System.out.println(book);
		
		System.out.println(book1);
	}

}

class Books
{
	String name;
	double price;
	
	public Books(String name,double price)
	{
		this.name = name;
		this.price = price;
		
	}
	/** whenever you are going to call Object directly it gives output something odd so
	 *  for correct output always make sure you override a toString method
	 */
	
	public String toString()
	{
		return this.name+"::::"+this.price;
	}
}
