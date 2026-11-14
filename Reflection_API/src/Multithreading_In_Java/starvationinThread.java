package Multithreading_In_Java;

public class starvationinThread {
	
	public static void main(String[] args)
	{
		Thread t = new Thread(()->{
			while(true)
			{
				System.out.println("***");
			}
			
		});
		
		Thread t1 = new Thread(()->{
			
			for(int i=0;i<100000;i++)
			{
				System.out.println(i);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t.start();
		t1.start();
	}

}
