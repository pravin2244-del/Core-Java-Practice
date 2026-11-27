package Practice_with_java;

public class Alternateprime {
	public static void main(String[] args)
	{
		int num = 1000;
		int count = 0;
		for(int i=1;i<num;i++)
		{
			if(i==1)
			{
				continue;
			}
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				//System.out.println("PrimeNumber:"+i);
				//count++;
				if(count%2!=0)
				{
					System.out.println(i);
					
					System.out.println("Count:"+count);
					count++;
				}
				
				
			}
			
			
		}
		//System.out.println("Count:"+count);
		
		
	}

}
