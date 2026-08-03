package Practice_with_java;

public class Arrayreturning {
	public static void main(String[] args)
	{
		City city = new City();
		int[] s = city.solving();
		
		System.out.println(s[0]);
		System.out.println(s.length);
		

}
}

class City 
{
	String name;
	//returning method
    public int[] solving()
	{
		int[] arr = new int[] {2,10,23};
		return arr;
		
	}

}
