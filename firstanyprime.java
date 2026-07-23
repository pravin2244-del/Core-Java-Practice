package core_practise;
// write a java program to print first hundread prime numbers
public class firstanyprime {
	public static void main(String[] args)
	{
		
	
	int num=2;
	int counter = 0;
	
	while(counter<100)
	{
	boolean flag=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag = false;
			
		}
	}
	
	if(flag == true)
	{  
		counter++;
		System.out.println("prime number:"+num);
	}
	num++;
	}
	
	
	
	}

}
