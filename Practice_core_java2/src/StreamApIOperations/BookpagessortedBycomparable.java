package StreamApIOperations;

import java.util.ArrayList;
import java.util.List;

public class BookpagessortedBycomparable {
	
	public static void main(String[] args)
		{
			List<Book_pages> list = new ArrayList<Book_pages>();
			
			list.add(new Book_pages("java",1000,"Nitesh_sir",20));
			list.add(new Book_pages("python",100,"Abhishek_sir",30));
			list.add(new Book_pages("chemistry",300,"Pradip_sir",40));
			list.add(new Book_pages("physics",10,"pravin",50));
			
			System.out.println(list);
			
			list.stream()
			.sorted((i,o)->{return Integer.compare(o.pages, i.pages);})
			.limit(2)
			.skip(1)
			.forEach((i)->{System.out.println(i);});
			
		}

	}

	class Book_pages //implements Comparable<Book_pages>
	{
		String name;
		int price;
		String author_name;
		int pages;
		
		public Book_pages(String name,int price,String author_name,int pages)
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

		
		/*public int compareTo(Book_pages o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.pages, o.pages);
		}*/
		
	}



