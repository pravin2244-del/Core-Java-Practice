package Constructors_in_java;

public class ConstructorCreation {
	public static void main(String[] args)
	{
		Car car = new Car(); // constructor(same name as per class name)
		car.price = 2345;
		car.company = "Lamborgoni";
		car.company_owner = "pravin";
		
		car.running();
		Car.cleaning();
		
	}

}

class Car {
	double price;
	String company;
	String company_owner;
	
 public void running()
 {
	 System.out.println("best runners are required to race:");
 }
 
 public static void cleaning()
 {
	 System.out.println("clean car everyday");
	 }
 
 public Car() // constructor
 {
	 System.out.println("This is constructor:");
 }
}
