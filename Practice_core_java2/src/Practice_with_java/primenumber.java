package Practice_with_java;

public class primenumber {
	public static void main(String[] args)
	{
		int num = 25;
		boolean flag = true;
	    for(int i=2;i<num;i++)
	    {
	    	if(num%i==0)
	    	{
	    		flag = false;
	    		break;
	    	}
	    }
	    if(flag == true)
	    {
	    	System.out.println("Prime number:");
	    }
	    else
	    {
	    	System.out.println("Composite number:");
	    }
	}

}
