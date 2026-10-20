package StreamApIOperations;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	public static void main(String[] args)
	{
		
		List<Employes> list = new ArrayList<Employes>();
		
		list.add(new Employes(1,"Pravin",233003));
		list.add(new Employes(2,"pradip",2233334));
		list.add(new Employes(3,"nitesh",500050));
		
		System.out.println(list);
		
		list.stream()
		.filter((i)->{return i.salary>1000;}).forEach((i)->{System.out.println(i);});
		
		
		
	}

}

class Employes
{
	int emp_id;
	String emp_name;
    int salary;
    
    public Employes(int emp_id,String emp_name,int salary)
    {
    	super();
    	this.emp_id = emp_id;
    	this.emp_name = emp_name;
    	this.salary = salary;
    }
    
    public String toString()
    {
		return "emp_name"+emp_name + ",emp_id"+emp_id+ ",salary"+salary;
    	
    }
}
