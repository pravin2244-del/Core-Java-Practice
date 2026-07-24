package Practice_with_java;

public class oddsum {
	public static void main(String[] args)
	{
		int num = 450;
		int sum=0;
		boolean flag=true;
		// find odd sum from 1 to 450
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
		}
		System.out.println("oddsum:"+sum);
		
		for(int i=2;i<sum;i++)
		{
			if(sum%i==0)
			{
				flag = false;
				
			}
		}
		if(flag==true)
		{
			System.out.println("give sum is prime:");
		}
		else
		{
			System.out.println("given sum is composite:");
		}
	}

}
