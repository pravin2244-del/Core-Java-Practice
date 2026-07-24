package Practice_with_java;

public class evenoddsum {
	public static void main(String[] args)
	{
		int num = 1000;
		int evensum = 0;
		int oddsum = 0;
		boolean flag = true;
		
		// find even sum from 1 to 1000 numbers
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				evensum = evensum+i;
			}
		}
		System.out.println("Evensum:"+evensum);
		
		// check evensum is prime or not
		
	for(int i=2;i<evensum;i++)
	{
		if(evensum%i==0)
		{
			flag = false;
		}
	}
	
    if(flag==true)
    {
    	System.out.println("Evensum is prime");
    	
    }
    else
    {
    	System.out.println("Evensum is composite");
    }
    
    // find oddsum from 1 to 1000 numbers
    
    for(int i=1;i<=num;i++)
    {
    	if(i%2!=0)
    	{
    		oddsum = oddsum+i;
    	}
    }
    System.out.println("Oddsum:"+oddsum);
    
    // check oddsum is prime or not
    
    for(int i=2;i<oddsum;i++)
    {
    	if(oddsum%i==0)
    	{
    		flag = false;
    	}
    }
    if(flag==true)
    {
    	System.out.println("Oddsum is prime");
    }
    else
    {
    	System.out.println("Oddsum is composite");
    }
	}

}
