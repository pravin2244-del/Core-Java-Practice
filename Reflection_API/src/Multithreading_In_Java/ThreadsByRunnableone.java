package Multithreading_In_Java;

public class ThreadsByRunnableone {
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
			
			for(int i=0;i<11;i++)
			{
				System.out.println("King pravin");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		t1.run();
	}

}
