package Multithreading_In_Java;

public class printevenandoddwiththread {
	
	public static void main(String[] args)
	{
		Thread even = new Thread(()->{
			
			for(int i=1;i<20;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even:"+i);
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		Thread odd = new Thread(()->{
			for(int i=1;i<20;i++)
			{
				if(i%2!=0)
				{
					System.out.println("odd:"+i);
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		even.start();
		
		odd.start();
	}

}
