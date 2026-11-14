package Multithreading_In_Java;

public class Firstthread {
	
	public static void main(String[] args)
	{
		
		Demo d = new Demo();
		d.start();
		
		Demo d2 = new Demo();
		d2.start();
		
		Demo d3 = new Demo();
		d3.start();
		
	}

}

class Demo extends Thread
{
	public void run() 
	{
		for(int i=0;i<=100;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(i);
			System.out.println("*");
		}
	}

	
}
