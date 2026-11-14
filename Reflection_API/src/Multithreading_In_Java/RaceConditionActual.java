package Multithreading_In_Java;

public class RaceConditionActual {
	
	public static void main(String[] args) throws InterruptedException
	{
		Student stud = new Student();
		
		Threadone t1 = new Threadone();
		
		Threadtwo t2 = new Threadtwo();
		
		t1.stud = stud;
		
		t2.stud = stud;
		
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(stud.getId());
		
	}

}

class Student
{
	int id;
	
	public void increament()
	{
		this.id++;
	}
	
	public  int getId()
	{
		return this.id;
	}
	
}

class Threadone extends Thread
{
	public Student stud;
	public void run()
	{
		for(int i=1;i<50001;i++)
		{
			//System.out.println(i);
			stud.increament();
		}
		
		
	}
}

class Threadtwo extends Thread
{
	public Student stud;
	public void run()
	{
		for(int i=1;i<50001;i++)
		{
			stud.increament();
		}
		
		
	}
}
