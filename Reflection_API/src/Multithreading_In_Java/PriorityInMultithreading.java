package Multithreading_In_Java;

public class PriorityInMultithreading {
	
	public static void main(String[] args)
	{
		Thread t = new Thread(()->{
			
			for(int i=1;i<=20;i++)
			{
				System.out.println(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("a");
			}
		});
		
		System.out.println(t.getPriority());
		
		System.out.println(t2.getPriority());
		
		System.out.println("********************");
		
		t.setPriority(4);
		t2.setPriority(10);
		t.start();
		t2.start();
	}

}
