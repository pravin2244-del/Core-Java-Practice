package Constructors_in_java;

public class PrivateConstructorInJava {
	
	public static void main(String[] args)
	{
		Student_1 stud = Student_1.of();
		
		//xSystem.out.println(stud);
	}

}

class Student_1
{
	private Student_1()
	{
		System.out.println("**");
	}
	
	public static Student_1 of()
	{
		return new Student_1();
	}
}
