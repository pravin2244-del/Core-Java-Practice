package Practice_with_java;

public class equalequalorEqualsto {
	
	public static void main(String[] args)
	{
		Car car = new Car("mustang");
		Car car2 = new Car("mustang");
		
		System.out.println(car==car2);
		System.out.println(car.equals(car2)); //.equals to by default always check memeory refresnce not a contain
		
	}

}

class Car extends Object
{
	String name;
	public Car(String name)
	{
		this.name = name;
	}
	
	
}
