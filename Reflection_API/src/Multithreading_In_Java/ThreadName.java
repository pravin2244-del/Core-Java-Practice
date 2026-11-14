package Multithreading_In_Java;

public class ThreadName {
	
	public static void main(String[] args)
	{
		Thread t = new Thread(()->{
			
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
		},"Login_thread");
		
		Thread t2 = new Thread(()->{
			for(int i=20;i<25;i++)
			{
				System.out.println(i);
			}
		},"Main_thread");
		
		System.out.println(t.getName());
		System.out.println(t2.getName());
		t.start();
		t2.start();
	}

}
