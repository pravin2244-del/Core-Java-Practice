package Practice_with_java;

public class Methodcreation {
	public static void main(String[] args)
	{
		Student one = new Student();
		one.name = "pravin"; // variable initailization
		one.roll_no = 5184;
		one.percent = 89.99;
		one.age = 21;
		
		System.out.println(one.name);
		System.out.println(one.roll_no);
		System.out.println(one.percent);
		
		one.study(); // methods calling from class
		one.exam();
		
	}
	

}

class Student {
	String name;// variable declaration
	int roll_no;
	double percent;
	int age;
	
	public void study()
	{
		System.out.println("i am just study in dream not in real world");
	}
	
	public void exam()
	{
		System.out.println("i want to first rank in study");
	}
}
