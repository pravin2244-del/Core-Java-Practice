package Practice_with_java;

public class Methodcreationtwo {
	public static void main(String[] args)
	{
		Java_uss first = new Java_uss();
		first.name ="king pravin";
		first.age = 21;
		first.laptop = "lenovo";
		first.gender = 'M';
		
		System.out.println(first.name);
		System.out.println(first.age);
		System.out.println(first.laptop);
		System.out.println(first.gender);
		System.out.println(Java_uss.teacher);
		first.Study();
		//first.teacher = "Mahi_sir";
		System.out.println(Java_uss.teacher);
		
		
	    Java_uss second = new Java_uss();
	    second.name = "Avinash";
	    second.age = 22;
	    second.laptop = "Dell";
	    second.gender = 'M';
	    
	    System.out.println(second.name);
	    System.out.println(Java_uss.teacher);
	    second.Sleep();
	    
		
	}

}

class Java_uss {
	static String teacher = "Mahesh_sir"; // static variable
	String name; // Instances variable
	int age;
	String laptop;
	char gender;
	
	public  void Study()
	{
		String name = "Terian_lannister";//Local variable
		System.out.println("name:"+name);
		System.out.println("I do study everyday");
	}
	
	public void Sleep()
	{
		System.out.println("I sleep every day just five hours");
	}
	
	public  static void Timepass()
	{
		System.out.println("I hate to just time pass");
	}
	
}