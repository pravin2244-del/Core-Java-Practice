package StreamApIOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethodInCustom {
	
	
	public static void main(String[] args)
	{
		List<Employee_2> list = List.of(new Employee_2(1,"john","hr"),new Employee_2(2,"rob","It"),new Employee_2(3,"arya","hr"),new Employee_2(4,"Sansa","gov"));
		
		System.out.println(list);
		
		Map<String ,List<Employee_2>> mp = list.stream()
				
		.collect(Collectors.groupingBy((i)->{return i.dept;}));
		
		System.out.println(mp);
		
	}

}

class Employee_2
{
	int id;
	String name;
	String dept;
	
	public Employee_2(int id,String name,String dept)
	{
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public String toString()
	{
		return "ID:" +id+ ",Name:" +name+ ",Dept:" +dept;
	}
}
