package Practice_with_java;

public class evensum {
	// find sum of evennumber between 1 to 50 & check is it prime
	public static void main(String[] args)
	{
		
		int sum = 0;
		boolean flag = true;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				
			sum=sum+i;	
				
			}
			
		}
		System.out.println("sum:"+sum);
		
		for(int i=2;i<sum;i++)
		{
			if(sum%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("upcoming sum is prime");
		}
		else
		{
			System.out.println("upcoming sum is composite");
		}
		
		
	}

}
