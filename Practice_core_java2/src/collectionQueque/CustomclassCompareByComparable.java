package collectionQueque;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomclassCompareByComparable {
	
	public static void main(String[] args)
	{
		PriorityQueue<Staff> PQ = new PriorityQueue<Staff>(new SalComparator());
		
		PQ.add(new Staff("Jadhav",60000));
		PQ.add(new Staff("Kale",30000));
		PQ.add(new Staff("Shinde",50000));
		PQ.add(new Staff("More",44000));
		
		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		
		System.out.println(PQ.peek());
	}

}

class Staff
{
	String name;
	int Salary;
	
	public Staff(String name,int Salary)
	{
		super();
		this.name = name;
		this.Salary = Salary;
		
	}
	
	public String toString()
	{
		return "name:"+name+ ",Salary:"+Salary;
	}
}

class NameComparator implements Comparator<Staff>
{

	@Override
	public int compare(Staff o1, Staff o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class SalComparator implements Comparator<Staff>
{

	@Override
	public int compare(Staff o1, Staff o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.Salary, o2.Salary);
	}
	
}
