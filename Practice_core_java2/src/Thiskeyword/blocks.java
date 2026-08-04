package Thiskeyword;

public class blocks {
	public static void main(String[] args)
	{
		System.out.println(School.name);
		
		School one = new School();
        School ones = new School();
        
        one.address = "Yewlevadi";
        System.out.println(one.rank);
        System.out.println(one.address);
        ones.address = "Kothrud";
        System.out.println(ones.address);
       
		
		
	}

}

class School
{
	static String name;
	String address;
	int rank;
	
	static
	{
		name = "RMD";
		System.out.println("This is static block");
	}
	
	{
		rank = 2;
		System.out.println("This should be a instance block");
	}
	
	public School()
	{
		System.out.println("My school is worst in this world");
	}
}
