package Practice_with_java;
// write a program to find first 500 prime numbers
public class firstanyprime {
	public static void main(String[] args)
	{
		int counter = 0;
		int sum = 0;
		int num = 2;
		
		while(counter<500)
		{
			boolean flag=true;
			for(int i=2;i<num;i++)
			{
				if(num%i == 0)
				{
					flag= false;
					
				}
				
			
				
					
			}
			if(flag==true)
			{
				System.out.println("Prime:"+num);
				sum = sum+num;
				counter++;
				
			}
			num++;
			
			
		}
	 System.out.println("sum:"+sum);
		
	}

}
