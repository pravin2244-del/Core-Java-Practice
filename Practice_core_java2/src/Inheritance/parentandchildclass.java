package Inheritance;

public class parentandchildclass {
	public static void main(String[] args)
	{
		
		//Car one = new Car();
		Honda honda = new Honda();
		honda.start();
		honda.run();
		honda.car_break();
		honda.design();
		
		System.out.println(honda.vechicle_type);
	 //(reference)  (object)
		Car car = new Car();
		car.start();
		car.run();
		car.car_break();
		
		//polymorphic object
		
		Car car2 = new Honda();
		// this one is also known as plymaorphic object
		car2.start();
		
		
		
		
	}

}

class Car // parent class
{
	
	String vechicle_type = "four wheeler";
	public void start()
	{
		System.out.println("starts to start");
	}
	public void run()
	{
		System.out.println("Every cars runs on highway");
	}
	
	public void car_break()
	{
		System.out.println("Every car has break without break car does not stop");
		
	}
	
	
	
}


class Honda extends Car // child class
{
	public void design()
	{
		System.out.println("Honda has the best model");
	}
	
}