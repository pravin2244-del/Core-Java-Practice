package Thiskeyword;

public class thisvariable {
	public static void main(String[] args)
	{
		Student stud = new Student(101,"king kohali");
		
		System.out.println(stud.name);
		System.out.println(stud.id);
	
		
		
	}

}

class Student
{
	String name;
	int id;
	
	public Student(int id, String name)
	{
		this.name = name;
		this.id = id;
		
		this.run();
		this.walk();
	}
	
	public void run()
	{
		System.out.println("virat is the king in the cricket:");
	}
	
	public void walk()
	{
		System.out.println("when i walked all people side");
	}
	
	
}
