package Multithreading_In_Java;

public class ThreadWiththeRunnable {
	
	public static void main(String[] args)
	{
		Thread t = new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				try
				{
					 Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		t.run();
		
		
				
			
				
	}

}
