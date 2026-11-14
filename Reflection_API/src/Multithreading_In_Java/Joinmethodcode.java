package Multithreading_In_Java;

public class Joinmethodcode {
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread1 t1 = new Thread1();
		t1.start();
		t1.join();
		
		System.out.println("Good afternoon");
	}

}

class Thread1 extends Thread 
{
  public void run()
  {
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	  System.out.println("Good evening");
  }
  
  //System.out.println("Good afternoon");

	
}
