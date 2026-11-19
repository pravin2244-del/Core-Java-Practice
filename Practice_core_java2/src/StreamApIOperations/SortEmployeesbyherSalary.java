package StreamApIOperations;

import java.util.ArrayList;

public class SortEmployeesbyherSalary {
	
	public static void main(String[] args)
	{
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		list.add(new Emp(101,"Cristen",20000.23));
		list.add(new Emp(102,"Damen",30000.22));
		list.add(new Emp(103,"Aemond",40004.4));
		list.add(new Emp(104,"Aegon",47477.4));
		list.add(new Emp(105,"Rhenynra",55009.5));
		list.add(new Emp(106,"Bela",4598.5));
		list.add(new Emp(107,"Helena",20023.23));
		
		System.out.println(list);
		
		list.stream()
		//.sorted((o1,o2)->{return Double.compare(o2.salary, o1.salary);}) // comparator lambda
		.sorted()
		.forEach((i)->{System.out.println(i);});
		
	}

}

class Emp implements Comparable<Emp>
{
	int empid;
	String name;
	double salary;
	
	public Emp(int empid,String name,double salary)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Id:" +empid+ ",Name:" +name+ ",Salary:" +salary;
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return Double.compare(o.salary, this.salary);
	}
}
