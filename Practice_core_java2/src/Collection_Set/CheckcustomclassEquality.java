package Collection_Set;

import java.util.HashSet;

public class CheckcustomclassEquality {
	
	public static void main(String[] args)
	{
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student(100,"abc"));
		
		set.add(new Student(100,"abc"));
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		
	}

}

class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int hashCode()
	{
		System.out.println("---------------------");
		return this.id+name.length();
	}
	
	public boolean equals (Object obj)
	{
		System.out.println("***********************");
		Student stud = (Student)obj;
		return this.id==stud.id && this.name.equals(stud.name);
	}
	
	public String toString()
	{
		return "Student [id=" + id + ",name=" + name + "]";
	}
}