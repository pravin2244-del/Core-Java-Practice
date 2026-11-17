package MethodReferences;

import java.util.List;

public class ConstructorReference {
	
	public static void main(String[] args)
	{
		List.of("karn","arjun","Duryodhan","nakul")
		.stream()
		.map(Employee::new)
		.forEach(System.out::println);
	}

}

class Employee
{
	String name;
	
	public Employee(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return this.name;
	}
}
