package Practice_with_java;

public class primenumberone {
	public static void main(String[] args)
	{
		int num = 29;
		boolean flag = true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("composite number");
		}
	}

}
