package Multithreading_In_Java;

public class RaceconditionActualone {
	
	public static void main(String[] args) throws InterruptedException
	{
		Employee emp = new Employee();
		
		Tone t1 = new Tone();
		
		Ttwo t2 = new Ttwo();
		
		t1.emp = emp;
		t2.emp = emp;
		
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(emp.findId());
	}

}

class Employee
{
	int id;
	
	public void increasedId()
	{
		this.id++;
	}
	
	public int findId()
	{
		return this.id;
	}
}

class Tone extends Thread
{
	public Employee emp;
	
	public void run()
	{
		for(int i=1;i<5000;i++)
		{
			emp.increasedId();
		}
	}
}

class Ttwo extends Thread
{
	public Employee emp;
	
	public void run()
	{
		
	for(int i=1;i<5000;i++)
	{
		emp.increasedId();
	}
	
	}
}