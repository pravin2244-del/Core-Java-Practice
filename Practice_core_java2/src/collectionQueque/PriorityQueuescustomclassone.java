package collectionQueque;

import java.util.PriorityQueue;

public class PriorityQueuescustomclassone {
	
	public static void main(String[] args)
	{
		PriorityQueue<Employee> PQ = new PriorityQueue<Employee>();
		
		PQ.add(new Employee("pravin",55000));
		PQ.add(new Employee("Youraj",30000));
		PQ.add(new Employee("Avinash",4040));
		PQ.add(new Employee("Vansh",4555));
		
		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		
		System.out.println(PQ.poll());
		
		
	}

}

class Employee implements Comparable<Employee>
{
	String name;
	int salary;
	
	public Employee(String name,int salary)
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "name:"+name+ ",Salary:"+salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.salary, this.salary);
	}
}
