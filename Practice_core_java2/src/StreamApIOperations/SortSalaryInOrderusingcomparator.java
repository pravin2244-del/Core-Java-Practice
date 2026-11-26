package StreamApIOperations;

import java.util.ArrayList;
import java.util.List;

public class SortSalaryInOrderusingcomparator {
	
	public static void main(String[] args)
	{
      List<employee_1> list = new ArrayList<employee_1>();
		
		list.add(new employee_1(5,500,"Pra"));
		list.add(new employee_1(6,600,"pradip"));
		list.add(new employee_1(7,700,"nitesh"));
		list.add(new employee_1(8,800,"soham"));
		
		System.out.println(list);
		
		list.stream()
		.sorted((o1,o2)-> {return Double.compare(o2.salary, o1.salary);})
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
	}

}

class employee_1
{
	
	int id;
	double salary;
	String name;
	
	public employee_1(int id,double salary,String name)
	{
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		
		
	}
	
	public String toString()
	{
		return "Emp_id" +id+ ",name" +name+ ",Salary" +salary;
	}
}
